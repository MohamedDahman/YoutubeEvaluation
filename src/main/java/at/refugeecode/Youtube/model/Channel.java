/*
        **************************************************
        * Youtube Evaluation
        *
        * code written by: Mohamed Dahman
        *
        * This program for show the Youtube .
        *
        ***************************************************
*/

package at.refugeecode.Youtube.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Channel {

    @Id
    @GeneratedValue
    private Long id;

    private String Name;

}
