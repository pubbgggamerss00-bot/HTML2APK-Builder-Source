package q9;

/* loaded from: classes.dex */
public final class h extends a {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f22547a;

    /* renamed from: b, reason: collision with root package name */
    public final String f22548b;

    /* renamed from: c, reason: collision with root package name */
    public final String f22549c;

    /* renamed from: d, reason: collision with root package name */
    public final String f22550d;

    /* renamed from: e, reason: collision with root package name */
    public final String f22551e;

    /* renamed from: f, reason: collision with root package name */
    public final String f22552f;

    /* renamed from: g, reason: collision with root package name */
    public final String f22553g;

    /* renamed from: h, reason: collision with root package name */
    public final String f22554h;

    /* renamed from: i, reason: collision with root package name */
    public final String f22555i;

    /* renamed from: j, reason: collision with root package name */
    public final String f22556j;

    /* renamed from: k, reason: collision with root package name */
    public final String f22557k;

    /* renamed from: l, reason: collision with root package name */
    public final String f22558l;

    public h(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f22547a = num;
        this.f22548b = str;
        this.f22549c = str2;
        this.f22550d = str3;
        this.f22551e = str4;
        this.f22552f = str5;
        this.f22553g = str6;
        this.f22554h = str7;
        this.f22555i = str8;
        this.f22556j = str9;
        this.f22557k = str10;
        this.f22558l = str11;
    }

    @Override // q9.a
    public final String a() {
        return this.f22558l;
    }

    @Override // q9.a
    public final String b() {
        return this.f22556j;
    }

    @Override // q9.a
    public final String c() {
        return this.f22550d;
    }

    @Override // q9.a
    public final String d() {
        return this.f22554h;
    }

    @Override // q9.a
    public final String e() {
        return this.f22549c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        Integer num = this.f22547a;
        if (num == null) {
            if (aVar.l() != null) {
                return false;
            }
        } else if (!num.equals(aVar.l())) {
            return false;
        }
        String str = this.f22548b;
        if (str == null) {
            if (aVar.i() != null) {
                return false;
            }
        } else if (!str.equals(aVar.i())) {
            return false;
        }
        String str2 = this.f22549c;
        if (str2 == null) {
            if (aVar.e() != null) {
                return false;
            }
        } else if (!str2.equals(aVar.e())) {
            return false;
        }
        String str3 = this.f22550d;
        if (str3 == null) {
            if (aVar.c() != null) {
                return false;
            }
        } else if (!str3.equals(aVar.c())) {
            return false;
        }
        String str4 = this.f22551e;
        if (str4 == null) {
            if (aVar.k() != null) {
                return false;
            }
        } else if (!str4.equals(aVar.k())) {
            return false;
        }
        String str5 = this.f22552f;
        if (str5 == null) {
            if (aVar.j() != null) {
                return false;
            }
        } else if (!str5.equals(aVar.j())) {
            return false;
        }
        String str6 = this.f22553g;
        if (str6 == null) {
            if (aVar.g() != null) {
                return false;
            }
        } else if (!str6.equals(aVar.g())) {
            return false;
        }
        String str7 = this.f22554h;
        if (str7 == null) {
            if (aVar.d() != null) {
                return false;
            }
        } else if (!str7.equals(aVar.d())) {
            return false;
        }
        String str8 = this.f22555i;
        if (str8 == null) {
            if (aVar.f() != null) {
                return false;
            }
        } else if (!str8.equals(aVar.f())) {
            return false;
        }
        String str9 = this.f22556j;
        if (str9 == null) {
            if (aVar.b() != null) {
                return false;
            }
        } else if (!str9.equals(aVar.b())) {
            return false;
        }
        String str10 = this.f22557k;
        if (str10 == null) {
            if (aVar.h() != null) {
                return false;
            }
        } else if (!str10.equals(aVar.h())) {
            return false;
        }
        String str11 = this.f22558l;
        return str11 == null ? aVar.a() == null : str11.equals(aVar.a());
    }

    @Override // q9.a
    public final String f() {
        return this.f22555i;
    }

    @Override // q9.a
    public final String g() {
        return this.f22553g;
    }

    @Override // q9.a
    public final String h() {
        return this.f22557k;
    }

    public final int hashCode() {
        Integer num = this.f22547a;
        int iHashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        String str = this.f22548b;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f22549c;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f22550d;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f22551e;
        int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f22552f;
        int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.f22553g;
        int iHashCode7 = (iHashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.f22554h;
        int iHashCode8 = (iHashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.f22555i;
        int iHashCode9 = (iHashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.f22556j;
        int iHashCode10 = (iHashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        String str10 = this.f22557k;
        int iHashCode11 = (iHashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        String str11 = this.f22558l;
        return (str11 != null ? str11.hashCode() : 0) ^ iHashCode11;
    }

    @Override // q9.a
    public final String i() {
        return this.f22548b;
    }

    @Override // q9.a
    public final String j() {
        return this.f22552f;
    }

    @Override // q9.a
    public final String k() {
        return this.f22551e;
    }

    @Override // q9.a
    public final Integer l() {
        return this.f22547a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidClientInfo{sdkVersion=");
        sb.append(this.f22547a);
        sb.append(", model=");
        sb.append(this.f22548b);
        sb.append(", hardware=");
        sb.append(this.f22549c);
        sb.append(", device=");
        sb.append(this.f22550d);
        sb.append(", product=");
        sb.append(this.f22551e);
        sb.append(", osBuild=");
        sb.append(this.f22552f);
        sb.append(", manufacturer=");
        sb.append(this.f22553g);
        sb.append(", fingerprint=");
        sb.append(this.f22554h);
        sb.append(", locale=");
        sb.append(this.f22555i);
        sb.append(", country=");
        sb.append(this.f22556j);
        sb.append(", mccMnc=");
        sb.append(this.f22557k);
        sb.append(", applicationBuild=");
        return b.o.a(sb, this.f22558l, "}");
    }
}
