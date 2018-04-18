package u;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Model for entities
 * @author archuser
 */
public abstract class Model implements Serializable {
    
    /**
     * the id, <strong>to be annotated with :<br/>
     * <pre>
     * @Id
	 * @GeneratedValue(strategy = GenerationType.IDENTITY)
	 * </pre></strong>
     */
    protected long id;
    
    
    public Model() {
	}



	public long getId()
    {
        return this.id;
    }

    
    
    public void setID(long id)
    {
        this.id = id;
    }
}
