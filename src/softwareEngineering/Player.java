/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwareEngineering;
import java.util.ArrayList;

public class Player {
    boolean isPlaying;
    ArrayList<Card> hand;
    //tile location;
    //character - enum? Enum class distribute cards by switch?
    
    public Player(ArrayList<Card> hand){ //input from dealed deck
        this.hand = hand;
        isPlaying = true;
        //location = enum character default position(initial position)
    }
    
    public ArrayList<Card> suggestion(Card room, Card player, Card weapon){
        checkCardType(room, Type.Room);
        checkCardType(player, Type.Player);  //how to put these in exception??
        checkCardType(player, Type.Weapon);
        //try catch error if not in room(after tiles and location are completed)
        ArrayList<Card> ctr = new ArrayList<Card>(); //cards to reveal
        /*
        boolean isRevealed = false;
        while(!isRevealed){
            ArrayList<card> npc = next player cards;
            for(Card card:npc){
                if((card == room) || (card == player) || (card == weapon)){
                    ctr.add(card);
                    isRevealed = true;
                }
            }
        }
        */
        return ctr; //return required only if revealing is a state
    }
    
    public void accusation(Card room, Card player, Card weapon){
        checkCardType(room, Type.Room);
        checkCardType(player, Type.Player);
        checkCardType(player, Type.Weapon);
        /*if((murderCards[0] == room) && (murderCards[1] == player) && (murderCards[2] == weapon)){
            win
        } else {
            isPlaying = false;
        }*/
    }
    
    public void revealCard(ArrayList<Card> suggestion){
        //required if cards will reveal progressively(dealt in line 32??)
    }
    
    public void checkCardType(Card card, Type type){ //can return exception
        if(card.type != type){
            System.out.println("error"); //return exception
        }
    }
    
    //public tile getLocation(){return location}
}
