import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Optional;

class ErrorHandling {

    void handleErrorByThrowingIllegalArgumentException() {
        throw new IllegalArgumentException();
    }

    void handleErrorByThrowingIllegalArgumentExceptionWithDetailMessage(String message) {
        throw new IllegalArgumentException(message);
    }

    void handleErrorByThrowingAnyCheckedException() throws CustomCheckedException {
        try{
            int a = 5/0;
        }catch(ArithmeticException e){
        throw new CustomCheckedException("DevideByZero");
        }
    }

    void handleErrorByThrowingAnyCheckedExceptionWithDetailMessage(String message) throws CustomCheckedException {
        try{
            File file = new File("not_existing_file.txt");
            FileInputStream stream = new FileInputStream(file);
        }catch(FileNotFoundException e){
            throw new CustomCheckedException(message);
        }
    }

    void handleErrorByThrowingAnyUncheckedException() {
        try {
            int a = 5/0;
        }catch(ArithmeticException e){
            throw new CustomUncheckedException();
        }
    }

    void handleErrorByThrowingAnyUncheckedExceptionWithDetailMessage(String message) {
        try {
            int a = 5/0;
        }catch(ArithmeticException e){
            throw new CustomUncheckedException(message);
        }
    }

    void handleErrorByThrowingCustomCheckedException() throws CustomCheckedException {
        try{
            File file = new File("not_existing_file.txt");
            FileInputStream stream = new FileInputStream(file);
        }catch(FileNotFoundException e){
            throw new CustomCheckedException();
        }
    }

    void handleErrorByThrowingCustomCheckedExceptionWithDetailMessage(String message) throws CustomCheckedException {
        try{
            File file = new File("not_existing_file.txt");
            FileInputStream stream = new FileInputStream(file);
        }catch(FileNotFoundException e){
            throw new CustomCheckedException(message);
        }
    }

    void handleErrorByThrowingCustomUncheckedException() {
        try {
            int a = 5/0;
        }catch(ArithmeticException e){
            throw new CustomUncheckedException();
        }
    }

    void handleErrorByThrowingCustomUncheckedExceptionWithDetailMessage(String message) {
        try {
            int a = 5/0;
        }catch(ArithmeticException e){
            throw new CustomUncheckedException(message);
        }
    }

    Optional<Integer> handleErrorByReturningOptionalInstance(String integer) {
        try {
            return Optional.of(Integer.parseInt(integer));
        } catch (NumberFormatException e) {
            return Optional.empty();
        }

    }

}
