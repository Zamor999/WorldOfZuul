/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worldofzuul;

/**
 *
 * @author Demy
 */
public class Game {
    String rawText = null;
    int unusedVar = 0;
    
    public Game()
    {
        this.rawText = "Hello World!";
    }
    
    public void run()
    {
        System.out.println(rawText);
    }
    
}
