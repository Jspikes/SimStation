package mvc;

import java.io.Serializable;

public abstract class Model extends Publisher implements Serializable {
    String fName;
    boolean changes;
    public void changed(){
        notifySubscribers();
    }
    public void setUnsavedChanges(boolean b){
        changes = b;
    }
    public boolean getUnsavedChanges(){
        return changes;
    }
    public void setFileName(String fName) {
        this.fName = fName;
    }
    public String getFileName() {
        return fName;
    }

}
