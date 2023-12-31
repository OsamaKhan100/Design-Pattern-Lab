/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gof.State;

/**
 *
 * @author elitebook g3
 */
public class LockedState extends State {

    LockedState(Player player) {
        super(player);
        UI.changeLabelState("Locked");
    }

    @Override
    public String onLock() {
        player.changeState(new PlayingState(player));
        player.setLocked(false);
        player.setPlaying(false);
        player.getIterator().reset();
        return "Ready";
    }

    @Override
    public String onPlay() {
        player.changeState(new PlayingState(player));
        player.setPlaying(false);
        player.setLocked(false);
        return "Ready";
    }

    @Override
    public String onNext() {
        return "Locked...";
    }

    @Override
    public String onPrevious() {
        return "Locked...";
    }
}