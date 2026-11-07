package okhttp3.internal.http2;

import hi.f0;
import hi.g;
import hi.j;
import hi.x;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.r;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Http2Reader;
import okhttp3.internal.http2.Huffman;
import org.bouncycastle.asn1.eac.CertificateBody;
import qg.m;

/* loaded from: classes2.dex */
public final class Hpack {

    /* renamed from: a, reason: collision with root package name */
    public static final Hpack f19591a = new Hpack();

    /* renamed from: b, reason: collision with root package name */
    public static final Header[] f19592b;

    /* renamed from: c, reason: collision with root package name */
    public static final Map<j, Integer> f19593c;

    public static final class Reader {

        /* renamed from: c, reason: collision with root package name */
        public final f0 f19596c;

        /* renamed from: f, reason: collision with root package name */
        public int f19599f;

        /* renamed from: g, reason: collision with root package name */
        public int f19600g;

        /* renamed from: a, reason: collision with root package name */
        public int f19594a = 4096;

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList f19595b = new ArrayList();

        /* renamed from: d, reason: collision with root package name */
        public Header[] f19597d = new Header[8];

        /* renamed from: e, reason: collision with root package name */
        public int f19598e = 7;

        public Reader(Http2Reader.ContinuationSource continuationSource) {
            this.f19596c = x.b(continuationSource);
        }

        public final int a(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.f19597d.length;
                while (true) {
                    length--;
                    i11 = this.f19598e;
                    if (length < i11 || i10 <= 0) {
                        break;
                    }
                    Header header = this.f19597d[length];
                    r.b(header);
                    int i13 = header.f19590c;
                    i10 -= i13;
                    this.f19600g -= i13;
                    this.f19599f--;
                    i12++;
                }
                Header[] headerArr = this.f19597d;
                System.arraycopy(headerArr, i11 + 1, headerArr, i11 + 1 + i12, this.f19599f);
                this.f19598e += i12;
            }
            return i12;
        }

        public final j b(int i10) throws IOException {
            if (i10 >= 0) {
                Hpack hpack = Hpack.f19591a;
                hpack.getClass();
                Header[] headerArr = Hpack.f19592b;
                if (i10 <= headerArr.length - 1) {
                    hpack.getClass();
                    return headerArr[i10].f19588a;
                }
            }
            Hpack.f19591a.getClass();
            int length = this.f19598e + 1 + (i10 - Hpack.f19592b.length);
            if (length >= 0) {
                Header[] headerArr2 = this.f19597d;
                if (length < headerArr2.length) {
                    Header header = headerArr2[length];
                    r.b(header);
                    return header.f19588a;
                }
            }
            throw new IOException("Header index too large " + (i10 + 1));
        }

        public final void c(Header header) {
            this.f19595b.add(header);
            int i10 = header.f19590c;
            int i11 = this.f19594a;
            if (i10 > i11) {
                Header[] headerArr = this.f19597d;
                m.m(headerArr, 0, headerArr.length, null);
                this.f19598e = this.f19597d.length - 1;
                this.f19599f = 0;
                this.f19600g = 0;
                return;
            }
            a((this.f19600g + i10) - i11);
            int i12 = this.f19599f + 1;
            Header[] headerArr2 = this.f19597d;
            if (i12 > headerArr2.length) {
                Header[] headerArr3 = new Header[headerArr2.length * 2];
                System.arraycopy(headerArr2, 0, headerArr3, headerArr2.length, headerArr2.length);
                this.f19598e = this.f19597d.length - 1;
                this.f19597d = headerArr3;
            }
            int i13 = this.f19598e;
            this.f19598e = i13 - 1;
            this.f19597d[i13] = header;
            this.f19599f++;
            this.f19600g += i10;
        }

        public final j d() throws IOException {
            f0 source = this.f19596c;
            byte b10 = source.readByte();
            byte[] bArr = Util.f19393a;
            int i10 = b10 & 255;
            int i11 = 0;
            boolean z10 = (b10 & 128) == 128;
            long jE = e(i10, CertificateBody.profileType);
            if (!z10) {
                return source.m(jE);
            }
            g gVar = new g();
            Huffman.f19726a.getClass();
            r.e(source, "source");
            Huffman.Node node = Huffman.f19729d;
            Huffman.Node node2 = node;
            int i12 = 0;
            for (long j10 = 0; j10 < jE; j10++) {
                byte b11 = source.readByte();
                byte[] bArr2 = Util.f19393a;
                i11 = (i11 << 8) | (b11 & 255);
                i12 += 8;
                while (i12 >= 8) {
                    Huffman.Node[] nodeArr = node2.f19730a;
                    r.b(nodeArr);
                    node2 = nodeArr[(i11 >>> (i12 - 8)) & 255];
                    r.b(node2);
                    if (node2.f19730a == null) {
                        gVar.q0(node2.f19731b);
                        i12 -= node2.f19732c;
                        node2 = node;
                    } else {
                        i12 -= 8;
                    }
                }
            }
            while (i12 > 0) {
                Huffman.Node[] nodeArr2 = node2.f19730a;
                r.b(nodeArr2);
                Huffman.Node node3 = nodeArr2[(i11 << (8 - i12)) & 255];
                r.b(node3);
                int i13 = node3.f19732c;
                if (node3.f19730a != null || i13 > i12) {
                    break;
                }
                gVar.q0(node3.f19731b);
                i12 -= i13;
                node2 = node;
            }
            return gVar.m(gVar.f13061b);
        }

        public final int e(int i10, int i11) throws IOException {
            int i12 = i10 & i11;
            if (i12 < i11) {
                return i12;
            }
            int i13 = 0;
            while (true) {
                byte b10 = this.f19596c.readByte();
                byte[] bArr = Util.f19393a;
                int i14 = b10 & 255;
                if ((b10 & 128) == 0) {
                    return i11 + (i14 << i13);
                }
                i11 += (b10 & Byte.MAX_VALUE) << i13;
                i13 += 7;
            }
        }
    }

    public static final class Writer {

        /* renamed from: a, reason: collision with root package name */
        public final g f19601a;

        /* renamed from: c, reason: collision with root package name */
        public boolean f19603c;

        /* renamed from: g, reason: collision with root package name */
        public int f19607g;

        /* renamed from: h, reason: collision with root package name */
        public int f19608h;

        /* renamed from: b, reason: collision with root package name */
        public int f19602b = Integer.MAX_VALUE;

        /* renamed from: d, reason: collision with root package name */
        public int f19604d = 4096;

        /* renamed from: e, reason: collision with root package name */
        public Header[] f19605e = new Header[8];

        /* renamed from: f, reason: collision with root package name */
        public int f19606f = 7;

        public Writer(g gVar) {
            this.f19601a = gVar;
        }

        public final void a(int i10) {
            int i11;
            if (i10 > 0) {
                int length = this.f19605e.length - 1;
                int i12 = 0;
                while (true) {
                    i11 = this.f19606f;
                    if (length < i11 || i10 <= 0) {
                        break;
                    }
                    Header header = this.f19605e[length];
                    r.b(header);
                    i10 -= header.f19590c;
                    int i13 = this.f19608h;
                    Header header2 = this.f19605e[length];
                    r.b(header2);
                    this.f19608h = i13 - header2.f19590c;
                    this.f19607g--;
                    i12++;
                    length--;
                }
                Header[] headerArr = this.f19605e;
                int i14 = i11 + 1;
                System.arraycopy(headerArr, i14, headerArr, i14 + i12, this.f19607g);
                Header[] headerArr2 = this.f19605e;
                int i15 = this.f19606f + 1;
                Arrays.fill(headerArr2, i15, i15 + i12, (Object) null);
                this.f19606f += i12;
            }
        }

        public final void b(Header header) {
            int i10 = header.f19590c;
            int i11 = this.f19604d;
            if (i10 > i11) {
                Header[] headerArr = this.f19605e;
                m.m(headerArr, 0, headerArr.length, null);
                this.f19606f = this.f19605e.length - 1;
                this.f19607g = 0;
                this.f19608h = 0;
                return;
            }
            a((this.f19608h + i10) - i11);
            int i12 = this.f19607g + 1;
            Header[] headerArr2 = this.f19605e;
            if (i12 > headerArr2.length) {
                Header[] headerArr3 = new Header[headerArr2.length * 2];
                System.arraycopy(headerArr2, 0, headerArr3, headerArr2.length, headerArr2.length);
                this.f19606f = this.f19605e.length - 1;
                this.f19605e = headerArr3;
            }
            int i13 = this.f19606f;
            this.f19606f = i13 - 1;
            this.f19605e[i13] = header;
            this.f19607g++;
            this.f19608h += i10;
        }

        public final void c(j data) throws IOException {
            r.e(data, "data");
            Huffman.f19726a.getClass();
            int iD = data.d();
            long j10 = 0;
            long j11 = 0;
            for (int i10 = 0; i10 < iD; i10++) {
                byte bI = data.i(i10);
                byte[] bArr = Util.f19393a;
                j11 += Huffman.f19728c[bI & 255];
            }
            int i11 = (int) ((j11 + 7) >> 3);
            int iD2 = data.d();
            g gVar = this.f19601a;
            if (i11 >= iD2) {
                e(data.d(), CertificateBody.profileType, 0);
                gVar.k0(data);
                return;
            }
            g gVar2 = new g();
            Huffman.f19726a.getClass();
            int iD3 = data.d();
            int i12 = 0;
            for (int i13 = 0; i13 < iD3; i13++) {
                byte bI2 = data.i(i13);
                byte[] bArr2 = Util.f19393a;
                int i14 = bI2 & 255;
                int i15 = Huffman.f19727b[i14];
                byte b10 = Huffman.f19728c[i14];
                j10 = (j10 << b10) | i15;
                i12 += b10;
                while (i12 >= 8) {
                    i12 -= 8;
                    gVar2.q0((int) (j10 >> i12));
                }
            }
            if (i12 > 0) {
                gVar2.q0((int) ((j10 << (8 - i12)) | (255 >>> i12)));
            }
            j jVarM = gVar2.m(gVar2.f13061b);
            e(jVarM.d(), CertificateBody.profileType, 128);
            gVar.k0(jVarM);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void d(ArrayList arrayList) throws IOException {
            int length;
            int length2;
            if (this.f19603c) {
                int i10 = this.f19602b;
                if (i10 < this.f19604d) {
                    e(i10, 31, 32);
                }
                this.f19603c = false;
                this.f19602b = Integer.MAX_VALUE;
                e(this.f19604d, 31, 32);
            }
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                Header header = (Header) arrayList.get(i11);
                j jVarP = header.f19588a.p();
                j jVar = header.f19589b;
                Hpack.f19591a.getClass();
                Integer num = Hpack.f19593c.get(jVarP);
                if (num != null) {
                    int iIntValue = num.intValue();
                    length2 = iIntValue + 1;
                    if (2 > length2 || length2 >= 8) {
                        length = length2;
                        length2 = -1;
                    } else {
                        Header[] headerArr = Hpack.f19592b;
                        if (r.a(headerArr[iIntValue].f19589b, jVar)) {
                            length = length2;
                        } else if (r.a(headerArr[length2].f19589b, jVar)) {
                            length2 = iIntValue + 2;
                            length = length2;
                        }
                    }
                } else {
                    length = -1;
                    length2 = -1;
                }
                if (length2 == -1) {
                    int i12 = this.f19606f + 1;
                    int length3 = this.f19605e.length;
                    while (true) {
                        if (i12 >= length3) {
                            break;
                        }
                        Header header2 = this.f19605e[i12];
                        r.b(header2);
                        if (r.a(header2.f19588a, jVarP)) {
                            Header header3 = this.f19605e[i12];
                            r.b(header3);
                            if (r.a(header3.f19589b, jVar)) {
                                int i13 = i12 - this.f19606f;
                                Hpack.f19591a.getClass();
                                length2 = Hpack.f19592b.length + i13;
                                break;
                            } else if (length == -1) {
                                int i14 = i12 - this.f19606f;
                                Hpack.f19591a.getClass();
                                length = i14 + Hpack.f19592b.length;
                            }
                        }
                        i12++;
                    }
                }
                if (length2 != -1) {
                    e(length2, CertificateBody.profileType, 128);
                } else if (length == -1) {
                    this.f19601a.q0(64);
                    c(jVarP);
                    c(jVar);
                    b(header);
                } else {
                    j prefix = Header.f19582d;
                    jVarP.getClass();
                    r.e(prefix, "prefix");
                    if (!jVarP.l(0, prefix, prefix.d()) || r.a(Header.f19587i, jVarP)) {
                        e(length, 63, 64);
                        c(jVar);
                        b(header);
                    } else {
                        e(length, 15, 0);
                        c(jVar);
                    }
                }
            }
        }

        public final void e(int i10, int i11, int i12) {
            g gVar = this.f19601a;
            if (i10 < i11) {
                gVar.q0(i10 | i12);
                return;
            }
            gVar.q0(i12 | i11);
            int i13 = i10 - i11;
            while (i13 >= 128) {
                gVar.q0(128 | (i13 & CertificateBody.profileType));
                i13 >>>= 7;
            }
            gVar.q0(i13);
        }
    }

    static {
        Header header = new Header(Header.f19587i, "");
        j jVar = Header.f19584f;
        Header header2 = new Header(jVar, "GET");
        Header header3 = new Header(jVar, "POST");
        j jVar2 = Header.f19585g;
        Header header4 = new Header(jVar2, "/");
        Header header5 = new Header(jVar2, "/index.html");
        j jVar3 = Header.f19586h;
        Header header6 = new Header(jVar3, "http");
        Header header7 = new Header(jVar3, "https");
        j jVar4 = Header.f19583e;
        Header[] headerArr = {header, header2, header3, header4, header5, header6, header7, new Header(jVar4, "200"), new Header(jVar4, "204"), new Header(jVar4, "206"), new Header(jVar4, "304"), new Header(jVar4, "400"), new Header(jVar4, "404"), new Header(jVar4, "500"), new Header("accept-charset", ""), new Header("accept-encoding", "gzip, deflate"), new Header("accept-language", ""), new Header("accept-ranges", ""), new Header("accept", ""), new Header("access-control-allow-origin", ""), new Header("age", ""), new Header("allow", ""), new Header("authorization", ""), new Header("cache-control", ""), new Header("content-disposition", ""), new Header("content-encoding", ""), new Header("content-language", ""), new Header("content-length", ""), new Header("content-location", ""), new Header("content-range", ""), new Header("content-type", ""), new Header("cookie", ""), new Header("date", ""), new Header("etag", ""), new Header("expect", ""), new Header("expires", ""), new Header("from", ""), new Header("host", ""), new Header("if-match", ""), new Header("if-modified-since", ""), new Header("if-none-match", ""), new Header("if-range", ""), new Header("if-unmodified-since", ""), new Header("last-modified", ""), new Header("link", ""), new Header("location", ""), new Header("max-forwards", ""), new Header("proxy-authenticate", ""), new Header("proxy-authorization", ""), new Header("range", ""), new Header("referer", ""), new Header("refresh", ""), new Header("retry-after", ""), new Header("server", ""), new Header("set-cookie", ""), new Header("strict-transport-security", ""), new Header("transfer-encoding", ""), new Header("user-agent", ""), new Header("vary", ""), new Header("via", ""), new Header("www-authenticate", "")};
        f19592b = headerArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(headerArr.length);
        int length = headerArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (!linkedHashMap.containsKey(headerArr[i10].f19588a)) {
                linkedHashMap.put(headerArr[i10].f19588a, Integer.valueOf(i10));
            }
        }
        Map<j, Integer> mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        r.d(mapUnmodifiableMap, "unmodifiableMap(result)");
        f19593c = mapUnmodifiableMap;
    }

    private Hpack() {
    }

    public static void a(j name) throws IOException {
        r.e(name, "name");
        int iD = name.d();
        for (int i10 = 0; i10 < iD; i10++) {
            byte bI = name.i(i10);
            if (65 <= bI && bI < 91) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(name.q()));
            }
        }
    }
}
