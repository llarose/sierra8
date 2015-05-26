package ca.usherbrooke.gegi.sierra6.shared.entity;

/**
 * Created by LAL on 20/05/2015.
 */
public class SessionEntity {
    private int sessionId;
    private String sessionName;

    public int getSessionId() {
        return sessionId;
    }

    public void setSessionId(int sessionId) {
        this.sessionId = sessionId;
    }

    public String getSessionName() {
        return sessionName;
    }

    public void setSessionName(String sessionName) {
        this.sessionName = sessionName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SessionEntity that = (SessionEntity) o;

        if (sessionId != that.sessionId) return false;
        if (sessionName != null ? !sessionName.equals(that.sessionName) : that.sessionName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sessionId;
        result = 31 * result + (sessionName != null ? sessionName.hashCode() : 0);
        return result;
    }
}
