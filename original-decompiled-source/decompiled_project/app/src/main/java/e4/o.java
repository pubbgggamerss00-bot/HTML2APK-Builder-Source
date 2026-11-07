package e4;

/* loaded from: classes.dex */
public abstract class o extends Exception {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f8386b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f8387a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(CharSequence charSequence, String type) {
        super(charSequence != null ? charSequence.toString() : null);
        kotlin.jvm.internal.r.e(type, "type");
        this.f8387a = charSequence;
    }
}
