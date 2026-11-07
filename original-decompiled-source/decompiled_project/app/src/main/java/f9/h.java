package f9;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f9737a = 0;

    public static final kotlinx.serialization.json.g a(ci.d dVar) {
        kotlin.jvm.internal.r.e(dVar, "<this>");
        kotlinx.serialization.json.g gVar = dVar instanceof kotlinx.serialization.json.g ? (kotlinx.serialization.json.g) dVar : null;
        if (gVar != null) {
            return gVar;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got " + kotlin.jvm.internal.h0.a(dVar.getClass()));
    }

    public static final kotlinx.serialization.json.n b(ci.e eVar) {
        kotlin.jvm.internal.r.e(eVar, "<this>");
        kotlinx.serialization.json.n nVar = eVar instanceof kotlinx.serialization.json.n ? (kotlinx.serialization.json.n) eVar : null;
        if (nVar != null) {
            return nVar;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got " + kotlin.jvm.internal.h0.a(eVar.getClass()));
    }
}
