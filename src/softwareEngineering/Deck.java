/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwareEngineering;
import java.util.ArrayList;
import java.util.Random;

public class Deck {
    ArrayList<Card> rooms;
    ArrayList<Card> players;
    ArrayList<Card> weapons;
    String[] defRooms = {"Study", "Hall", "Lounge", "Library", "Billard Room", "Dining Room", "Conservatory", "Ball Room", "Kıtchen"};
    String[] defPlayers = {"Col Mustard", "Prof Plum", "Rev Green", "Mrs Peacock", "Miss Scarlet", "Mrs White"};
    String[] defWeapons = {"Dagger", "Candlestick", "Revolver", "Rope", "Lead Piping", "Spanner"};
    ArrayList<Card> murderCards;
    ArrayList<Card> gameDeck;
    
    public Deck(String[] rooms, String[] players, String[] weapons){
        for(int i = 0; i <= rooms.length; i++){
        this.rooms.add(new Card(rooms[i], Type.Room));}
        for(int i = 0; i <= players.length; i++){
        this.players.add(new Card(players[i], Type.Player));}
        for(int i = 0; i <= weapons.length; i++){
        this.weapons.add(new Card(weapons[i], Type.Weapon));}
    }
    public Deck(){
        for(int i = 0; i <= defRooms.length; i++){
        this.rooms.add(new Card(defRooms[i], Type.Room));}
        for(int i = 0; i <= defPlayers.length; i++){
        this.players.add(new Card(defPlayers[i], Type.Player));}
        for(int i = 0; i <= defWeapons.length; i++){
        this.weapons.add(new Card(defWeapons[i], Type.Weapon));}
    }
    
    public ArrayList<Card> getMurderCards(){
        this.murderCards.add(rooms.get(rooms.size()));
        rooms.remove(rooms.size());
        this.murderCards.add(players.get(players.size()));
        players.remove(players.size());
        this.murderCards.add(weapons.get(weapons.size()));
        weapons.remove(weapons.size());
        return murderCards;
    }
    
    public ArrayList<Card> getGameDeck(){
        for(Card room:rooms){
            gameDeck.add(room);}
        for(Card player:players){
            gameDeck.add(player);}
        for(Card weapon:weapons){
            gameDeck.add(weapon);}
        return gameDeck;
    }
    
    public ArrayList<Card> shuffleGameDeck(){ //can be void
        ArrayList<Card> temp = new ArrayList<Card>();
        Random r = new Random();
        while(gameDeck.size() > 0){
            int x = r.nextInt(gameDeck.size()+1);
            temp.add(gameDeck.get(x));
            gameDeck.remove(x);
        }
        gameDeck = temp;
        return gameDeck;
    }
    
    public void shuffleTimes(int times){
        for(int i = 0; i <= times; i++){
            shuffleGameDeck();
        }
    }
}
