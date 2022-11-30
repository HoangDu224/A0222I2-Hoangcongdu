package Upload.repository;

import Upload.model.Music;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MusicRepository {
    static List<Music> musicRepository = new ArrayList<>();

    static {
        musicRepository.add(new Music("bai hat 1", "Ca si 1", "The Loai 1", "Link 1"));
        musicRepository.add(new Music("bai hat 2", "Ca si 2", "The Loai 2", "Link 2"));
        musicRepository.add(new Music("bai hat 3", "Ca si 3", "The Loai 3", "Link 3"));
    }
    public List<Music> findAll(){
        return musicRepository;
    }
    public void save(Music music){
        musicRepository.add(music);
    }
}
