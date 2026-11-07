package kotlinx.serialization.json;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f16442a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f16443b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f16444c;

    /* renamed from: d, reason: collision with root package name */
    public final String f16445d;

    /* renamed from: e, reason: collision with root package name */
    public final String f16446e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f16447f;

    /* renamed from: g, reason: collision with root package name */
    public final a f16448g;

    public f(boolean z10, boolean z11, boolean z12, String prettyPrintIndent, String classDiscriminator, boolean z13, a classDiscriminatorMode) {
        kotlin.jvm.internal.r.e(prettyPrintIndent, "prettyPrintIndent");
        kotlin.jvm.internal.r.e(classDiscriminator, "classDiscriminator");
        kotlin.jvm.internal.r.e(classDiscriminatorMode, "classDiscriminatorMode");
        this.f16442a = z10;
        this.f16443b = z11;
        this.f16444c = z12;
        this.f16445d = prettyPrintIndent;
        this.f16446e = classDiscriminator;
        this.f16447f = z13;
        this.f16448g = classDiscriminatorMode;
    }

    public final String toString() {
        return "JsonConfiguration(encodeDefaults=false, ignoreUnknownKeys=" + this.f16442a + ", isLenient=" + this.f16443b + ", allowStructuredMapKeys=false, prettyPrint=false, explicitNulls=" + this.f16444c + ", prettyPrintIndent='" + this.f16445d + "', coerceInputValues=false, useArrayPolymorphism=false, classDiscriminator='" + this.f16446e + "', allowSpecialFloatingPointValues=false, useAlternativeNames=" + this.f16447f + ", namingStrategy=null, decodeEnumsCaseInsensitive=false, allowTrailingComma=false, allowComments=false, classDiscriminatorMode=" + this.f16448g + ')';
    }
}
