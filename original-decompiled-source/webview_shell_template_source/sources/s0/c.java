package s0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final d f14325a = new d(null, false);

    /* renamed from: b, reason: collision with root package name */
    public static final d f14326b = new d(null, true);

    /* renamed from: c, reason: collision with root package name */
    public static final d f14327c;

    /* renamed from: d, reason: collision with root package name */
    public static final d f14328d;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class a implements b {

        /* renamed from: a, reason: collision with root package name */
        public static final a f14329a = new a();

        /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0020  */
        @Override // s0.c.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final int a(CharSequence charSequence, int i6) {
            int i7 = 2;
            for (int i8 = 0; i8 < i6 && i7 == 2; i8++) {
                byte directionality = Character.getDirectionality(charSequence.charAt(i8));
                d dVar = c.f14325a;
                if (directionality == 0) {
                    i7 = 1;
                } else if (directionality != 1 && directionality != 2) {
                    switch (directionality) {
                        case 14:
                        case 15:
                            break;
                        case 16:
                        case 17:
                            break;
                        default:
                            i7 = 2;
                            break;
                    }
                } else {
                    i7 = 0;
                }
            }
            return i7;
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface b {
        int a(CharSequence charSequence, int i6);
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    /* renamed from: s0.c$c, reason: collision with other inner class name */
    public static abstract class AbstractC0089c {

        /* renamed from: a, reason: collision with root package name */
        public final b f14330a;

        public AbstractC0089c(b bVar) {
            this.f14330a = bVar;
        }

        public abstract boolean a();

        public final boolean b(CharSequence charSequence, int i6) {
            if (charSequence == null || i6 < 0 || charSequence.length() - i6 < 0) {
                throw new IllegalArgumentException();
            }
            b bVar = this.f14330a;
            if (bVar == null) {
                return a();
            }
            int iA = bVar.a(charSequence, i6);
            if (iA == 0) {
                return true;
            }
            if (iA != 1) {
                return a();
            }
            return false;
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class d extends AbstractC0089c {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f14331b;

        public d(a aVar, boolean z6) {
            super(aVar);
            this.f14331b = z6;
        }

        @Override // s0.c.AbstractC0089c
        public final boolean a() {
            return this.f14331b;
        }
    }

    static {
        a aVar = a.f14329a;
        f14327c = new d(aVar, false);
        f14328d = new d(aVar, true);
    }
}
