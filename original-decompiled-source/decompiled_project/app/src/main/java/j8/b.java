package j8;

import ae.m;
import java.util.Map;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.asn1.eac.EACTags;
import vg.c;
import vg.e;

@e(c = "com.basitce.htmltoapk.credits.CreditsRepository", f = "CreditsRepository.kt", l = {138, EACTags.HISTORICAL_BYTES, 90}, m = "link")
/* loaded from: classes.dex */
public final class b extends c {

    /* renamed from: a, reason: collision with root package name */
    public a f15275a;

    /* renamed from: b, reason: collision with root package name */
    public Object f15276b;

    /* renamed from: c, reason: collision with root package name */
    public Object f15277c;

    /* renamed from: d, reason: collision with root package name */
    public m f15278d;

    /* renamed from: e, reason: collision with root package name */
    public Map f15279e;

    /* renamed from: f, reason: collision with root package name */
    public int f15280f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f15281g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ a f15282h;

    /* renamed from: j, reason: collision with root package name */
    public int f15283j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, tg.e<? super b> eVar) {
        super(eVar);
        this.f15282h = aVar;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f15281g = obj;
        this.f15283j |= PKIFailureInfo.systemUnavail;
        return a.a(this.f15282h, null, this);
    }
}
