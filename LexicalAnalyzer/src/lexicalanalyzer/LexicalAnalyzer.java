/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lexicalanalyzer;

import java.util.Scanner;

/**
 *
 * @author yasir
 */
public class LexicalAnalyzer {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) 
    { 
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter no of lines"); 
        String[] input=new String[scan.nextInt()];
        scan.nextLine();
        String con=" ";
        System.out.println("Please Enter your Program");
        for (int i=0;i<input.length;i++)
        {
            input[i]=scan.nextLine(); 
            con = con.concat(input[i]+" ");
        }
        System.out.println("\n input lines are :");
        String output[] = con.split(" ");
            for (String output1 : output)
            {
                System.out.print(" "+output1);
            }
            System.out.println("");
            int id = 0;
            int token = 0;
        for (int i=0;i<output.length;i++) 
        {
            if (null != output[i]) 
            {
                switch (output[i]) 
                {
                    case "String":
                    case "int":
                    case "float":
                    case "double":
                    case "boolean":
                        token++;
                        System.out.println("< DataType, " + output[i] + ">");
                        break;
                    case "if":
                    case "ifelse":
                    case "else":
                        token++;
                        System.out.println("< Conditonal Statement, " + output[i] + ">");
                    case ";":
                        token++;
                        System.out.println("< EndofStatement, " + output[i] + ">");
                        break;
                    case ",":
                        System.out.println("< colon, " + output[i] + ">");
                        break;
                    case "a":
                    case "b":
                    case "c":
                    case "d":
                    case "e":
                    case "f":
                    case "g":
                    case "h":
                    case "i":
                    case "j":
                    case "k":
                    case "l":
                        token++;
                        id++;
                        System.out.println("< id"+id+"," + output[i] + ">");
                        break;
                    case " ":
                        System.out.println("");
                        break;
                    case "1":
                    case "2":
                    case "3":
                    case "4":
                    case "5":
                    case "6":
                    case "7":
                    case "8":
                    case "9":
                    case "10":
                    case "20":
                        token++;
                        System.out.println("< number" + output[i] + ">");
                        break;
                    case "+":
                    case "-":
                    case "*":
                    case "/":
                    case "%":
                    case "=":
                    case "==":
                    case "<":
                    case ">":
                    case "&":
                    case "&&":
                    case "||":
                        token++;
                        System.out.println("< Operator, " + output[i] + ">");
                        break;
                    default:
                        System.out.println("Input Type is not Defined: " + output[i]);
                }
            }
        }
            System.out.println("Total Numbers of Tokens in your Program : "+token);                       
    }
    
}
