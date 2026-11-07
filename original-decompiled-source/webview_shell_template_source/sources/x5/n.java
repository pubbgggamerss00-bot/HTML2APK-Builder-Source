package x5;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class n extends kotlin.jvm.internal.k implements p5.l<u5.c, String> {
    public final /* synthetic */ CharSequence s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(CharSequence charSequence) {
        super(1);
        this.s = charSequence;
    }

    @Override // p5.l
    public final String invoke(u5.c cVar) {
        u5.c cVar2 = cVar;
        kotlin.jvm.internal.j.e("it", cVar2);
        CharSequence charSequence = this.s;
        kotlin.jvm.internal.j.e("<this>", charSequence);
        return charSequence.subSequence(cVar2.s, cVar2.f14720t + 1).toString();
    }
}
