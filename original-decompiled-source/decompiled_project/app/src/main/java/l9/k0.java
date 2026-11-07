package l9;

/* loaded from: classes.dex */
public final /* synthetic */ class k0 implements eh.l {
    @Override // eh.l
    public final Object invoke(Object obj) {
        String it = (String) obj;
        kotlin.jvm.internal.r.e(it, "it");
        int i10 = 0;
        for (int i11 = 0; i11 < it.length(); i11++) {
            if (it.charAt(i11) == '/') {
                i10++;
            }
        }
        return Integer.valueOf(i10);
    }
}
