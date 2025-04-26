import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import ru.netology.gavaqa.javaqamvn.services.VacationService;

import javax.annotation.processing.SupportedAnnotationTypes;

public class VacationServiceTest {

    @Test
    public void CalcServices() {
        VacationService service = new VacationService();
        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;
        int expected = 3;
        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);

    }
}
