import com.example.BackendChallenge.model.Calisan;
import com.example.BackendChallenge.repository.CalisanRepository;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class CalisanRepositoryTest {

    @Autowired
    private CalisanRepository calisanRepository;

    @Test
    public void testSaveCalisan(){
        Calisan calisan = new Calisan();
        calisan.setAdSoyad("Ahmet Yakar");
        calisan.setFirma("TR Eğitim");

        Calisan savedCalisan=calisanRepository.save(calisan);
            Assertions.assertNotNull(savedCalisan.getId());
            assertEquals("Ahmet Yakar",savedCalisan.getAdSoyad());
            assertEquals("TR Eğitim", savedCalisan.getFirma());
    }

    @Test
    public void testFindCalisanById(){
        Calisan calisan = new Calisan();
        calisan.setAdSoyad("Ahmet Yakar");
        calisan.setFirma("Enoca");

        Calisan savedCalisan = calisanRepository.save(calisan);
        Calisan foundCalisan = calisanRepository.findById(savedCalisan.getId()).get();
        assertEquals("Habip Yakar", foundCalisan.getAdSoyad());
        assertEquals("Ahmet Yakar", foundCalisan.getAdSoyad());
        assertEquals("Enoca", foundCalisan.getFirma());


    }

}
