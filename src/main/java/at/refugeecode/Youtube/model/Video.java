package at.refugeecode.Youtube.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Video {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Channel channel;

    private String video_id;

    private String title;

    private Integer view;

    private Integer likes;

    private Integer dislikes;

    private Integer comment_count;

    private String thumbnail_link;

}
