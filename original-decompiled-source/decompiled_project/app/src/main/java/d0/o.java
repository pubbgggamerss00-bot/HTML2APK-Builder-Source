package d0;

import d0.o.a;

/* loaded from: classes.dex */
public abstract class o<Interval extends a> {

    public interface a {

        /* renamed from: d0.o$a$a, reason: collision with other inner class name */
        public static final class C0078a extends kotlin.jvm.internal.s implements eh.l {

            /* renamed from: a, reason: collision with root package name */
            public static final C0078a f7207a = new C0078a(1);

            @Override // eh.l
            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                ((Number) obj).intValue();
                return null;
            }
        }

        default eh.l<Integer, Object> getKey() {
            return null;
        }

        default eh.l<Integer, Object> getType() {
            return C0078a.f7207a;
        }
    }

    public abstract a2 f();

    public final Object g(int i10) {
        Object objInvoke;
        g gVarB = f().b(i10);
        int i11 = i10 - gVarB.f7131a;
        eh.l<Integer, Object> key = gVarB.f7133c.getKey();
        return (key == null || (objInvoke = key.invoke(Integer.valueOf(i11))) == null) ? new e(i10) : objInvoke;
    }
}
