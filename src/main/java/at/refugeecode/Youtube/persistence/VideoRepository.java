package at.refugeecode.Youtube.persistence;

import at.refugeecode.Youtube.model.Video;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface VideoRepository extends JpaRepository<Video,Long>{
}
