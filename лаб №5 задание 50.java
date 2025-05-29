import java.io.*;
import java.util.*;

public class SimpleCalculator {
    static final String HISTORY_FILE = "history.txt";
    static List<String> history = new ArrayList<>();

    public static void main(String[] args) {
        loadHistory();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите выражение или 'exit':");
            String line = scanner.nextLine().trim();
            if (line.equalsIgnoreCase("exit")) break;
            try {
                double result = parseExpression(line);
                System.out.println("Результат: " + result);
                saveToHistory(line + " = " + result);
            } catch (Exception e) {
                System.out.println("Ошибка в выражении");
            }
        }
        saveHistory();
    }

    static void loadHistory() {
        try (BufferedReader br = new BufferedReader(new FileReader(HISTORY_FILE))) {
            String line;
            while ((line = br.readLine()) != null) history.add(line);
        } catch (IOException ignored) {}
    }

    static void saveHistory() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(HISTORY_FILE))) {
            for (String s : history) bw.write(s + "\n");
        } catch (IOException ignored) {}
    }

    static void saveToHistory(String entry) {
        history.add(entry);
    }

    
    static int pos;
    static String expr;

    static double parseExpression(String s) throws Exception {
        expr = s.replaceAll("\\s+", "");
        pos = 0;
        return parseAddSub();
    }

    static double parseAddSub() throws Exception {
        double value = parseMulDivMod();
        while (pos < expr.length()) {
            char c = expr.charAt(pos);
            if (c == '+' || c == '-') {
                pos++;
                double nextVal = parseMulDivMod();
                if (c == '+') value += nextVal;
                else value -= nextVal;
            } else break;
        }
        return value;
    }

    static double parseMulDivMod() throws Exception {
        double value = parsePower();
        while (pos < expr.length()) {
            char c = expr.charAt(pos);
            if (c == '*' || c == '/' || c == '%') {
                pos++;
                double nextVal = parsePower();
                if (c == '*') value *= nextVal;
                else if (c == '/') value /= nextVal;
                else value %= nextVal;
            } else break;
        }
        return value;
    }

    static double parsePower() throws Exception {
        double base = parseUnary();
        while (pos < expr.length() && expr.charAt(pos) == '^') {
            pos++;
            double exp = parseUnary();
            base = Math.pow(base, exp);
        }
        return base;
    }

    static double parseUnary() throws Exception {
        if (pos >= expr.length()) throw new Exception("Unexpected end");
        char c=expr.charAt(pos);
        if(c=='-'){
            pos++;
            return -parsePrimary();
        }
        return parsePrimary();
    }

    static double parsePrimary() throws Exception {
        if(pos>=expr.length()) throw new Exception("Unexpected end");
        char c=expr.charAt(pos);

        if(c=='|'){ 
            pos++;
            double val=parseExpressionUntil('|');
            if(expr.charAt(pos)!= '|') throw new Exception("Missing '|'");
            pos++;
            return Math.abs(val);
        }else if(c=='('){ 
            pos++;
            double val=parseAddSub();
            if(expr.charAt(pos)!=')') throw new Exception("Missing ')'");
            pos++;
            return val;
        }else if(Character.isDigit(c)||c=='.'){ 
        }else{
            throw new Exception("Unexpected character: "+c);
        }
    }

    static double parseExpressionUntil(char endChar) throws Exception{
        int startPos=pos;
        StringBuilder sb=new StringBuilder();
        while(pos<expr.length() && expr.charAt(pos)!=endChar){
            sb.append(expr.charAt(pos));
            pos++;
        }
        String subExpr=sb.toString();
        return parseExpression(subExpr);
    }

    static double parseNumber() throws Exception{
        int start=pos;
        while(pos<expr.length() && (Character.isDigit(expr.charAt(pos))||expr.charAt(pos)=='.')){
            pos++;
        }
        String numberStr=expr.substring(start,pos);
        return Double.parseDouble(numberStr);
    }
}