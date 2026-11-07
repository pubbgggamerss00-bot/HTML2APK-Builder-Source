package di;

import java.util.LinkedHashMap;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "kotlinx.serialization.json.internal.JsonTreeReader", f = "JsonTreeReader.kt", l = {24}, m = "readObject")
/* loaded from: classes2.dex */
public final class h0 extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public pg.b f8018a;

    /* renamed from: b, reason: collision with root package name */
    public i0 f8019b;

    /* renamed from: c, reason: collision with root package name */
    public LinkedHashMap f8020c;

    /* renamed from: d, reason: collision with root package name */
    public String f8021d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f8022e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i0 f8023f;

    /* renamed from: g, reason: collision with root package name */
    public int f8024g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(i0 i0Var, vg.a aVar) {
        super(aVar);
        this.f8023f = i0Var;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f8022e = obj;
        this.f8024g |= PKIFailureInfo.systemUnavail;
        return i0.a(this.f8023f, null, this);
    }
}
