package androidx.room;

@pg.d
/* loaded from: classes.dex */
public abstract class g<T> extends o0 {
    public abstract void d(i6.f fVar, T t3);

    public final void e(T t3) {
        i6.f fVarA = a();
        try {
            d(fVarA, t3);
            fVarA.x0();
        } finally {
            c(fVarA);
        }
    }
}
