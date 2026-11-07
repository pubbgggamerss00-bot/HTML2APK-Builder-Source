package x1;

import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import kotlin.jvm.internal.r;
import org.xmlpull.v1.XmlPullParser;
import q3.j;
import w1.h;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final XmlPullParser f32004a;

    /* renamed from: b, reason: collision with root package name */
    public int f32005b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final h f32006c;

    public a(XmlResourceParser xmlResourceParser) {
        this.f32004a = xmlResourceParser;
        h hVar = new h();
        hVar.f31182a = new float[64];
        this.f32006c = hVar;
    }

    public final float a(TypedArray typedArray, String str, int i10, float f10) {
        if (j.b(this.f32004a, str)) {
            f10 = typedArray.getFloat(i10, f10);
        }
        b(typedArray.getChangingConfigurations());
        return f10;
    }

    public final void b(int i10) {
        this.f32005b = i10 | this.f32005b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return r.a(this.f32004a, aVar.f32004a) && this.f32005b == aVar.f32005b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f32005b) + (this.f32004a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidVectorParser(xmlParser=");
        sb.append(this.f32004a);
        sb.append(", config=");
        return b.b.a(sb, this.f32005b, ')');
    }
}
