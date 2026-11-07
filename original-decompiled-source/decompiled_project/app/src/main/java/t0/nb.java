package t0;

import org.jf.dexlib2.dexbacked.raw.CdexHeaderItem;

/* loaded from: classes.dex */
public final class nb extends kotlin.jvm.internal.s implements eh.p<s1.e, p1.c, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ jb f26533a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f26534b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nb(jb jbVar, boolean z10) {
        super(2);
        this.f26533a = jbVar;
        this.f26534b = z10;
    }

    @Override // eh.p
    public final pg.f0 invoke(s1.e eVar, p1.c cVar) {
        s1.e eVar2 = eVar;
        long j10 = cVar.f21129a;
        rb rbVar = rb.f26896a;
        s1.e.f0(eVar2, this.f26533a.a(this.f26534b, true), eVar2.N0(rb.f26897b) / 2.0f, j10, null, 0, CdexHeaderItem.DEBUG_INFO_OFFSETS_TABLE_OFFSET);
        return pg.f0.f21461a;
    }
}
