package h6;

/* loaded from: classes.dex */
public interface d extends AutoCloseable {
    void C(int i10, String str);

    String W(int i10);

    void d(int i10, long j10);

    void e(int i10);

    default boolean getBoolean() {
        return getLong(0) != 0;
    }

    int getColumnCount();

    String getColumnName(int i10);

    long getLong(int i10);

    boolean isNull(int i10);

    void reset();

    boolean t0();
}
