package com.htmltoapk.template;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class AlarmRecord {
    private final String id;
    private final String message;
    private final long repeatIntervalMs;
    private final String title;
    private final long triggerAt;

    public AlarmRecord(String str, String str2, String str3, long j6, long j7) {
        kotlin.jvm.internal.j.e("id", str);
        kotlin.jvm.internal.j.e("title", str2);
        kotlin.jvm.internal.j.e("message", str3);
        this.id = str;
        this.title = str2;
        this.message = str3;
        this.triggerAt = j6;
        this.repeatIntervalMs = j7;
    }

    public static /* synthetic */ AlarmRecord copy$default(AlarmRecord alarmRecord, String str, String str2, String str3, long j6, long j7, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = alarmRecord.id;
        }
        if ((i6 & 2) != 0) {
            str2 = alarmRecord.title;
        }
        if ((i6 & 4) != 0) {
            str3 = alarmRecord.message;
        }
        if ((i6 & 8) != 0) {
            j6 = alarmRecord.triggerAt;
        }
        if ((i6 & 16) != 0) {
            j7 = alarmRecord.repeatIntervalMs;
        }
        long j8 = j7;
        String str4 = str3;
        return alarmRecord.copy(str, str2, str4, j6, j8);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.message;
    }

    public final long component4() {
        return this.triggerAt;
    }

    public final long component5() {
        return this.repeatIntervalMs;
    }

    public final AlarmRecord copy(String str, String str2, String str3, long j6, long j7) {
        kotlin.jvm.internal.j.e("id", str);
        kotlin.jvm.internal.j.e("title", str2);
        kotlin.jvm.internal.j.e("message", str3);
        return new AlarmRecord(str, str2, str3, j6, j7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AlarmRecord)) {
            return false;
        }
        AlarmRecord alarmRecord = (AlarmRecord) obj;
        return kotlin.jvm.internal.j.a(this.id, alarmRecord.id) && kotlin.jvm.internal.j.a(this.title, alarmRecord.title) && kotlin.jvm.internal.j.a(this.message, alarmRecord.message) && this.triggerAt == alarmRecord.triggerAt && this.repeatIntervalMs == alarmRecord.repeatIntervalMs;
    }

    public final String getId() {
        return this.id;
    }

    public final String getMessage() {
        return this.message;
    }

    public final long getRepeatIntervalMs() {
        return this.repeatIntervalMs;
    }

    public final String getTitle() {
        return this.title;
    }

    public final long getTriggerAt() {
        return this.triggerAt;
    }

    public int hashCode() {
        return Long.hashCode(this.repeatIntervalMs) + ((Long.hashCode(this.triggerAt) + androidx.camera.view.g.d(androidx.camera.view.g.d(this.id.hashCode() * 31, 31, this.title), 31, this.message)) * 31);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.title;
        String str3 = this.message;
        long j6 = this.triggerAt;
        long j7 = this.repeatIntervalMs;
        StringBuilder sbA = androidx.camera.camera2.internal.i0.a("AlarmRecord(id=", str, ", title=", str2, ", message=");
        sbA.append(str3);
        sbA.append(", triggerAt=");
        sbA.append(j6);
        sbA.append(", repeatIntervalMs=");
        sbA.append(j7);
        sbA.append(")");
        return sbA.toString();
    }
}
