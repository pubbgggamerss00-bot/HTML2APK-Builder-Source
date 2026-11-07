package o6;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import b.o;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: d, reason: collision with root package name */
    public final SparseIntArray f18969d;

    /* renamed from: e, reason: collision with root package name */
    public final Parcel f18970e;

    /* renamed from: f, reason: collision with root package name */
    public final int f18971f;

    /* renamed from: g, reason: collision with root package name */
    public final int f18972g;

    /* renamed from: h, reason: collision with root package name */
    public final String f18973h;

    /* renamed from: i, reason: collision with root package name */
    public int f18974i;

    /* renamed from: j, reason: collision with root package name */
    public int f18975j;

    /* renamed from: k, reason: collision with root package name */
    public int f18976k;

    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new p.a(), new p.a(), new p.a());
    }

    @Override // o6.a
    public final b a() {
        Parcel parcel = this.f18970e;
        int iDataPosition = parcel.dataPosition();
        int i10 = this.f18975j;
        if (i10 == this.f18971f) {
            i10 = this.f18972g;
        }
        return new b(parcel, iDataPosition, i10, o.a(new StringBuilder(), this.f18973h, "  "), this.f18966a, this.f18967b, this.f18968c);
    }

    @Override // o6.a
    public final boolean e() {
        return this.f18970e.readInt() != 0;
    }

    @Override // o6.a
    public final byte[] f() {
        Parcel parcel = this.f18970e;
        int i10 = parcel.readInt();
        if (i10 < 0) {
            return null;
        }
        byte[] bArr = new byte[i10];
        parcel.readByteArray(bArr);
        return bArr;
    }

    @Override // o6.a
    public final CharSequence g() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f18970e);
    }

    @Override // o6.a
    public final boolean h(int i10) {
        while (this.f18975j < this.f18972g) {
            int i11 = this.f18976k;
            if (i11 == i10) {
                return true;
            }
            if (String.valueOf(i11).compareTo(String.valueOf(i10)) > 0) {
                return false;
            }
            int i12 = this.f18975j;
            Parcel parcel = this.f18970e;
            parcel.setDataPosition(i12);
            int i13 = parcel.readInt();
            this.f18976k = parcel.readInt();
            this.f18975j += i13;
        }
        return this.f18976k == i10;
    }

    @Override // o6.a
    public final int i() {
        return this.f18970e.readInt();
    }

    @Override // o6.a
    public final <T extends Parcelable> T j() {
        return (T) this.f18970e.readParcelable(b.class.getClassLoader());
    }

    @Override // o6.a
    public final String k() {
        return this.f18970e.readString();
    }

    @Override // o6.a
    public final void m(int i10) {
        u();
        this.f18974i = i10;
        this.f18969d.put(i10, this.f18970e.dataPosition());
        q(0);
        q(i10);
    }

    @Override // o6.a
    public final void n(boolean z10) {
        this.f18970e.writeInt(z10 ? 1 : 0);
    }

    @Override // o6.a
    public final void o(byte[] bArr) {
        Parcel parcel = this.f18970e;
        if (bArr == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
    }

    @Override // o6.a
    public final void p(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f18970e, 0);
    }

    @Override // o6.a
    public final void q(int i10) {
        this.f18970e.writeInt(i10);
    }

    @Override // o6.a
    public final void r(Parcelable parcelable) {
        this.f18970e.writeParcelable(parcelable, 0);
    }

    @Override // o6.a
    public final void s(String str) {
        this.f18970e.writeString(str);
    }

    public final void u() {
        int i10 = this.f18974i;
        if (i10 >= 0) {
            int i11 = this.f18969d.get(i10);
            Parcel parcel = this.f18970e;
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i11);
            parcel.writeInt(iDataPosition - i11);
            parcel.setDataPosition(iDataPosition);
        }
    }

    public b(Parcel parcel, int i10, int i11, String str, p.a<String, Method> aVar, p.a<String, Method> aVar2, p.a<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.f18969d = new SparseIntArray();
        this.f18974i = -1;
        this.f18976k = -1;
        this.f18970e = parcel;
        this.f18971f = i10;
        this.f18972g = i11;
        this.f18975j = i10;
        this.f18973h = str;
    }
}
