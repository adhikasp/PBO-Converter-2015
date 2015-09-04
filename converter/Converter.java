/**
 * The interface Converter provide workaround to save
 * a converter class into a Java HashMap.
 *
 * For technical reference please see this link:
 * https://stackoverflow.com/questions/8200243/can-i-store-function-names-in-final-hashmap-for-execution
 * https://stackoverflow.com/questions/19063522/how-to-generically-implement-calling-methods-stored-in-a-hashmap
 *
 * @author Adhika Setya Pramudita <hello@adhikasetyap.me>
 * @NIM 14/365240/TK/42058
 */

package converter;

public interface Converter {
    void execute();
}