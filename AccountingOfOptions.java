package structures.goods;

import java.util.ArrayList;
import java.util.List;

import structures.operations.PHCount;
import structures.operations.PHConnection;

public class AccountingOfOptions {
    
    private Options options;
    
    private List<Integer> countsID = new ArrayList();
    private List<Integer> clientsID = new ArrayList();
    

    public AccountingOfOptions(Options options){
        this.options = options;
    }
                
    public Options getOptions() {
        return options;
    }
    
    public boolean hasCount(int id) {
        return countsID.contains(id);
    }
    
    public void addCount(int id) {
        if (!countsID.contains(id)) {
            countsID.add(id);
        }
    }
    
    public void delCount(int id) {
        if (countsID.contains(id)) {
            countsID.remove(new Integer(id));
        }
    }
    
    public List<Integer> getListOfCountsID() {
        return countsID;
    }
    
    public boolean hasClient(int id) {
        return clientsID.contains(id);
    }
    
    public void addClient(int id) {
        if (!clientsID.contains(id)) {
            clientsID.add(id);
        }
    }
    
    public void delClient(int id) {
        if (clientsID.contains(id)) {
            clientsID.remove(new Integer(id));
        }
    }
    
    public List<Integer> getListOfClientsID() {
        return clientsID;
    }
    
    public void updateAccordingToConnection(PHConnection phcon) {
        
        if (!clientsID.contains(phcon.getEntityId())) {
            clientsID.add(phcon.getEntityId());
        }
    }
    
    public void updateAccordingToCount(PHCount phcount) {
        
        if (!clientsID.contains(phcount.getEntityId())) {
            clientsID.add(phcount.getEntityId());
        }
    }
}
