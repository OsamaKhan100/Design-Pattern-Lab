/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gof.FA23finalExam;

/**
 *
 * @author elitebook g3
 */
public class Announcement implements CommunicatingObject {
    private String content;

    public Announcement(String content) {
        this.content = content;
    }

    @Override
    public String getContent() {
        return content;
    }
}
