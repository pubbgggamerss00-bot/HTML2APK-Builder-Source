package f9;

import com.basitce.htmltoapk.R;
import l9.a;

/* loaded from: classes.dex */
public final class h8 implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f9763a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a.EnumC0168a f9764b;

    public h8(boolean z10, a.EnumC0168a enumC0168a) {
        this.f9763a = z10;
        this.f9764b = enumC0168a;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else if (this.f9763a) {
            int iOrdinal = this.f9764b.ordinal();
            t0.ff.b(iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? com.google.crypto.tink.shaded.protobuf.t0.b(jVar2, 1317583765, R.string.editor_error_admob_app_id_invalid, jVar2) : com.google.crypto.tink.shaded.protobuf.t0.b(jVar2, 1317580469, R.string.editor_error_admob_prefix_missing, jVar2) : com.google.crypto.tink.shaded.protobuf.t0.b(jVar2, 1317575670, R.string.editor_helper_admob_app_id_warning, jVar2) : com.google.crypto.tink.shaded.protobuf.t0.b(jVar2, 1317570326, R.string.editor_error_admob_app_id_required, jVar2), null, ((t0.e2) jVar2.f(t0.f2.f25858a)).f25777w, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 0, 0, 131066);
        }
        return pg.f0.f21461a;
    }
}
