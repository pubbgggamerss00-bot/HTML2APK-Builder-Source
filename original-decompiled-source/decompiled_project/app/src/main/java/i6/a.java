package i6;

/* loaded from: classes.dex */
public final class a implements e {

    /* renamed from: a, reason: collision with root package name */
    public final String f14167a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f14168b;

    /* renamed from: i6.a$a, reason: collision with other inner class name */
    public static final class C0131a {
        public static void a(d dVar, Object[] objArr) {
            if (objArr == null) {
                return;
            }
            int length = objArr.length;
            int i10 = 0;
            while (i10 < length) {
                Object obj = objArr[i10];
                i10++;
                if (obj == null) {
                    dVar.e(i10);
                } else if (obj instanceof byte[]) {
                    dVar.L(i10, (byte[]) obj);
                } else if (obj instanceof Float) {
                    dVar.t(i10, ((Number) obj).floatValue());
                } else if (obj instanceof Double) {
                    dVar.t(i10, ((Number) obj).doubleValue());
                } else if (obj instanceof Long) {
                    dVar.d(i10, ((Number) obj).longValue());
                } else if (obj instanceof Integer) {
                    dVar.d(i10, ((Number) obj).intValue());
                } else if (obj instanceof Short) {
                    dVar.d(i10, ((Number) obj).shortValue());
                } else if (obj instanceof Byte) {
                    dVar.d(i10, ((Number) obj).byteValue());
                } else if (obj instanceof String) {
                    dVar.o(i10, (String) obj);
                } else {
                    if (!(obj instanceof Boolean)) {
                        throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i10 + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                    }
                    dVar.d(i10, ((Boolean) obj).booleanValue() ? 1L : 0L);
                }
            }
        }
    }

    public a(String str) {
        this.f14167a = str;
        this.f14168b = null;
    }

    @Override // i6.e
    public final void h(d dVar) {
        C0131a.a(dVar, this.f14168b);
    }

    @Override // i6.e
    public final String l() {
        return this.f14167a;
    }

    public a(String str, Object[] objArr) {
        this.f14167a = str;
        this.f14168b = objArr;
    }
}
