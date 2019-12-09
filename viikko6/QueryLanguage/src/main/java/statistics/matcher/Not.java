
package statistics.matcher;

import java.lang.reflect.Method;
import statistics.Player;

/**
 *
 * @author ida
 */
public class Not implements Matcher {
    
    Matcher matcher;
        

    public Not(Matcher matcher) {
        this.matcher = matcher;
    }

    @Override
    public boolean matches(Player p) {
        return !matcher.matches(p);        
    } 
}
