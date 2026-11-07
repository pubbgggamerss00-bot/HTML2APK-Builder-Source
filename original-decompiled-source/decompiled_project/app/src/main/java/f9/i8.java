package f9;

import com.basitce.htmltoapk.R;
import l9.a;

/* loaded from: classes.dex */
public final class i8 implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f9795a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a.b f9796b;

    public i8(boolean z10, a.b bVar) {
        this.f9795a = z10;
        this.f9796b = bVar;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else if (this.f9795a) {
            int iOrdinal = this.f9796b.ordinal();
            t0.ff.b(iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? com.google.crypto.tink.shaded.protobuf.t0.b(jVar2, 2044058359, R.string.editor_error_admob_unit_id_invalid, jVar2) : com.google.crypto.tink.shaded.protobuf.t0.b(jVar2, 2044054934, R.string.editor_error_admob_prefix_missing, jVar2) : com.google.crypto.tink.shaded.protobuf.t0.b(jVar2, 2044049944, R.string.editor_helper_admob_unit_id_warning, jVar2) : com.google.crypto.tink.shaded.protobuf.t0.b(jVar2, 2044044408, R.string.editor_error_admob_unit_id_required, jVar2), null, ((t0.e2) jVar2.f(t0.f2.f25858a)).f25777w, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 0, 0, 131066);
        }
        return pg.f0.f21461a;
    }
}
