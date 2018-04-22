package at.refugeecode.Youtube.persistence;

import at.refugeecode.Youtube.model.Channel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChannelRepository extends JpaRepository<Channel,Long>{

}
