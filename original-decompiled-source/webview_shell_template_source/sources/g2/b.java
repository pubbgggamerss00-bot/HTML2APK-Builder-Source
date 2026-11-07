package g2;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import androidx.activity.m;
import com.google.android.gms.ads.RequestConfiguration;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: d, reason: collision with root package name */
    public final SparseIntArray f13257d;

    /* renamed from: e, reason: collision with root package name */
    public final Parcel f13258e;

    /* renamed from: f, reason: collision with root package name */
    public final int f13259f;

    /* renamed from: g, reason: collision with root package name */
    public final int f13260g;
    public final String h;

    /* renamed from: i, reason: collision with root package name */
    public int f13261i;

    /* renamed from: j, reason: collision with root package name */
    public int f13262j;

    /* renamed from: k, reason: collision with root package name */
    public int f13263k;

    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, new w.a(), new w.a(), new w.a());
    }

    @Override // g2.a
    public final b a() {
        Parcel parcel = this.f13258e;
        int iDataPosition = parcel.dataPosition();
        int i6 = this.f13262j;
        if (i6 == this.f13259f) {
            i6 = this.f13260g;
        }
        return new b(parcel, iDataPosition, i6, m.e(new StringBuilder(), this.h, "  "), this.f13254a, this.f13255b, this.f13256c);
    }

    @Override // g2.a
    public final boolean e() {
        return this.f13258e.readInt() != 0;
    }

    @Override // g2.a
    public final byte[] f() {
        Parcel parcel = this.f13258e;
        int i6 = parcel.readInt();
        if (i6 < 0) {
            return null;
        }
        byte[] bArr = new byte[i6];
        parcel.readByteArray(bArr);
        return bArr;
    }

    @Override // g2.a
    public final CharSequence g() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f13258e);
    }

    @Override // g2.a
    public final boolean h(int i6) {
        while (this.f13262j < this.f13260g) {
            int i7 = this.f13263k;
            if (i7 == i6) {
                return true;
            }
            if (String.valueOf(i7).compareTo(String.valueOf(i6)) > 0) {
                return false;
            }
            int i8 = this.f13262j;
            Parcel parcel = this.f13258e;
            parcel.setDataPosition(i8);
            int i9 = parcel.readInt();
            this.f13263k = parcel.readInt();
            this.f13262j += i9;
        }
        return this.f13263k == i6;
    }

    @Override // g2.a
    public final int i() {
        return this.f13258e.readInt();
    }

    @Override // g2.a
    public final <T extends Parcelable> T j() {
        return (T) this.f13258e.readParcelable(b.class.getClassLoader());
    }

    @Override // g2.a
    public final String k() {
        return this.f13258e.readString();
    }

    @Override // g2.a
    public final void m(int i6) {
        u();
        this.f13261i = i6;
        this.f13257d.put(i6, this.f13258e.dataPosition());
        q(0);
        q(i6);
    }

    @Override // g2.a
    public final void n(boolean z6) {
        this.f13258e.writeInt(z6 ? 1 : 0);
    }

    @Override // g2.a
    public final void o(byte[] bArr) {
        Parcel parcel = this.f13258e;
        if (bArr == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
    }

    @Override // g2.a
    public final void p(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f13258e, 0);
    }

    @Override // g2.a
    public final void q(int i6) {
        this.f13258e.writeInt(i6);
    }

    @Override // g2.a
    public final void r(Parcelable parcelable) {
        this.f13258e.writeParcelable(parcelable, 0);
    }

    @Override // g2.a
    public final void s(String str) {
        this.f13258e.writeString(str);
    }

    public final void u() {
        int i6 = this.f13261i;
        if (i6 >= 0) {
            int i7 = this.f13257d.get(i6);
            Parcel parcel = this.f13258e;
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i7);
            parcel.writeInt(iDataPosition - i7);
            parcel.setDataPosition(iDataPosition);
        }
    }

    public b(Parcel parcel, int i6, int i7, String str, w.a<String, Method> aVar, w.a<String, Method> aVar2, w.a<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.f13257d = new SparseIntArray();
        this.f13261i = -1;
        this.f13263k = -1;
        this.f13258e = parcel;
        this.f13259f = i6;
        this.f13260g = i7;
        this.f13262j = i6;
        this.h = str;
    }
}
