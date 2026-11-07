package h8;

import h8.a;
import java.util.Iterator;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jf.dexlib2.dexbacked.raw.CdexHeaderItem;

@vg.e(c = "com.basitce.htmltoapk.ai.AiBackgroundTurns", f = "AiBackgroundTurns.kt", l = {122, CdexHeaderItem.DEBUG_INFO_BASE, 134}, m = "poll")
/* loaded from: classes.dex */
public final class e extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public a f12376a;

    /* renamed from: b, reason: collision with root package name */
    public Iterator f12377b;

    /* renamed from: c, reason: collision with root package name */
    public a.C0114a f12378c;

    /* renamed from: d, reason: collision with root package name */
    public long f12379d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f12380e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a f12381f;

    /* renamed from: g, reason: collision with root package name */
    public int f12382g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(a aVar, vg.c cVar) {
        super(cVar);
        this.f12381f = aVar;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f12380e = obj;
        this.f12382g |= PKIFailureInfo.systemUnavail;
        return a.a(this.f12381f, this);
    }
}
