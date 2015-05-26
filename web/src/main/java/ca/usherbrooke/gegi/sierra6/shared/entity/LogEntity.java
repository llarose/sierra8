package ca.usherbrooke.gegi.sierra6.shared.entity;

import java.sql.Date;

/**
 * Created by LAL on 20/05/2015.
 */
public class LogEntity {
    private int logId;
    private Date logEntryDate;
    private Date logRegistration;

    public int getLogId() {
        return logId;
    }

    public void setLogId(int logId) {
        this.logId = logId;
    }

    public Date getLogEntryDate() {
        return logEntryDate;
    }

    public void setLogEntryDate(Date logEntryDate) {
        this.logEntryDate = logEntryDate;
    }

    public Date getLogRegistration() {
        return logRegistration;
    }

    public void setLogRegistration(Date logRegistration) {
        this.logRegistration = logRegistration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LogEntity logEntity = (LogEntity) o;

        if (logId != logEntity.logId) return false;
        if (logEntryDate != null ? !logEntryDate.equals(logEntity.logEntryDate) : logEntity.logEntryDate != null)
            return false;
        if (logRegistration != null ? !logRegistration.equals(logEntity.logRegistration) : logEntity.logRegistration != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = logId;
        result = 31 * result + (logEntryDate != null ? logEntryDate.hashCode() : 0);
        result = 31 * result + (logRegistration != null ? logRegistration.hashCode() : 0);
        return result;
    }
}
