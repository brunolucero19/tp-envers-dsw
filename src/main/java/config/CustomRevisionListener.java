package config;

import audit.Revision;
import org.hibernate.envers.RevisionListener;

//Revision listener es el encargado de hacer las revisiones
public class CustomRevisionListener implements RevisionListener {
    public void newRevision(Object revisionEntity){
        final Revision revision = (Revision) revisionEntity;
    }
}
