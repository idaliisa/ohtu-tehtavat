package statistics;

import statistics.matcher.All;
import statistics.matcher.HasAtLeast;
import statistics.matcher.HasFewerThan;
import statistics.matcher.Matcher;
import statistics.matcher.PlaysIn;

/**
 *
 * @author ida
 */
public class QueryBuilder {
    Matcher matcher;
    
    public QueryBuilder() {
        matcher = new All();
    }
    
    public Matcher build() {
        return matcher;  
    }
    
    
    public QueryBuilder playsIn(String team) {
        this.matcher = new PlaysIn(matcher, team);
        return this;  
    }
    
    public QueryBuilder hasAtLeast(int value, String category) {
        this.matcher = new HasAtLeast(matcher, value, category);
        return this;  
    }
        
    public QueryBuilder hasFewerThan(int value, String category) {
        this.matcher = new HasFewerThan(matcher, value, category);
        return this;  
    }
    
}
