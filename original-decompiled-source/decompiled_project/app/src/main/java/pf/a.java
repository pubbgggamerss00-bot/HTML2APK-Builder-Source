package pf;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f21440a;

    /* renamed from: b, reason: collision with root package name */
    public final b f21441b;

    public a(float[] fArr, b bVar) {
        this.f21440a = (float[]) fArr.clone();
        this.f21441b = bVar;
    }

    public final String toString() {
        return "PDColor{components=" + Arrays.toString(this.f21440a) + ", patternName=null}";
    }
}
