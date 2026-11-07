package cf;

import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

/* loaded from: classes2.dex */
public final class l extends b implements Comparable<l> {
    public static final l A;
    public static final l A0;
    public static final l A1;
    public static final l A2;
    public static final l B;
    public static final l B0;
    public static final l B1;
    public static final l B2;
    public static final l C;
    public static final l C0;
    public static final l C1;
    public static final l C2;
    public static final l D;
    public static final l D0;
    public static final l D1;
    public static final l D2;
    public static final l E;
    public static final l E0;
    public static final l E1;
    public static final l E2;
    public static final l F;
    public static final l F0;
    public static final l F1;
    public static final l F2;
    public static final l G;
    public static final l G0;
    public static final l G1;
    public static final l G2;
    public static final l H;
    public static final l H0;
    public static final l H1;
    public static final l H2;
    public static final l I;
    public static final l I0;
    public static final l I1;
    public static final l I2;
    public static final l J0;
    public static final l J1;
    public static final l K;
    public static final l K0;
    public static final l K1;
    public static final l L;
    public static final l L0;
    public static final l L1;
    public static final l M;
    public static final l M0;
    public static final l M1;
    public static final l N;
    public static final l N0;
    public static final l N1;
    public static final l O;
    public static final l O0;
    public static final l O1;
    public static final l P;
    public static final l P0;
    public static final l P1;
    public static final l Q;
    public static final l Q0;
    public static final l Q1;
    public static final l R;
    public static final l R0;
    public static final l R1;
    public static final l S;
    public static final l S0;
    public static final l S1;
    public static final l T;
    public static final l T0;
    public static final l T1;
    public static final l U;
    public static final l U0;
    public static final l U1;
    public static final l V;
    public static final l V0;
    public static final l V1;
    public static final l W;
    public static final l W0;
    public static final l W1;
    public static final l X;
    public static final l X0;
    public static final l X1;
    public static final l Y;
    public static final l Y0;
    public static final l Y1;
    public static final l Z;
    public static final l Z0;
    public static final l Z1;

    /* renamed from: a0, reason: collision with root package name */
    public static final l f5447a0;

    /* renamed from: a1, reason: collision with root package name */
    public static final l f5448a1;

    /* renamed from: a2, reason: collision with root package name */
    public static final l f5449a2;

    /* renamed from: b0, reason: collision with root package name */
    public static final l f5450b0;

    /* renamed from: b1, reason: collision with root package name */
    public static final l f5451b1;

    /* renamed from: b2, reason: collision with root package name */
    public static final l f5452b2;

    /* renamed from: c0, reason: collision with root package name */
    public static final l f5453c0;

    /* renamed from: c1, reason: collision with root package name */
    public static final l f5454c1;

    /* renamed from: c2, reason: collision with root package name */
    public static final l f5455c2;

    /* renamed from: d0, reason: collision with root package name */
    public static final l f5457d0;

    /* renamed from: d1, reason: collision with root package name */
    public static final l f5458d1;

    /* renamed from: d2, reason: collision with root package name */
    public static final l f5459d2;

    /* renamed from: e0, reason: collision with root package name */
    public static final l f5461e0;

    /* renamed from: e1, reason: collision with root package name */
    public static final l f5462e1;

    /* renamed from: e2, reason: collision with root package name */
    public static final l f5463e2;

    /* renamed from: f0, reason: collision with root package name */
    public static final l f5465f0;

    /* renamed from: f1, reason: collision with root package name */
    public static final l f5466f1;

    /* renamed from: f2, reason: collision with root package name */
    public static final l f5467f2;

    /* renamed from: g, reason: collision with root package name */
    public static final l f5468g;

    /* renamed from: g0, reason: collision with root package name */
    public static final l f5469g0;

    /* renamed from: g1, reason: collision with root package name */
    public static final l f5470g1;

    /* renamed from: g2, reason: collision with root package name */
    public static final l f5471g2;

    /* renamed from: h, reason: collision with root package name */
    public static final l f5472h;

    /* renamed from: h0, reason: collision with root package name */
    public static final l f5473h0;

    /* renamed from: h1, reason: collision with root package name */
    public static final l f5474h1;

    /* renamed from: h2, reason: collision with root package name */
    public static final l f5475h2;

    /* renamed from: i0, reason: collision with root package name */
    public static final l f5476i0;

    /* renamed from: i1, reason: collision with root package name */
    public static final l f5477i1;

    /* renamed from: i2, reason: collision with root package name */
    public static final l f5478i2;

    /* renamed from: j, reason: collision with root package name */
    public static final l f5479j;

    /* renamed from: j0, reason: collision with root package name */
    public static final l f5480j0;

    /* renamed from: j1, reason: collision with root package name */
    public static final l f5481j1;

    /* renamed from: j2, reason: collision with root package name */
    public static final l f5482j2;

    /* renamed from: k, reason: collision with root package name */
    public static final l f5483k;

    /* renamed from: k0, reason: collision with root package name */
    public static final l f5484k0;

    /* renamed from: k1, reason: collision with root package name */
    public static final l f5485k1;

    /* renamed from: k2, reason: collision with root package name */
    public static final l f5486k2;

    /* renamed from: l, reason: collision with root package name */
    public static final l f5487l;

    /* renamed from: l0, reason: collision with root package name */
    public static final l f5488l0;

    /* renamed from: l1, reason: collision with root package name */
    public static final l f5489l1;

    /* renamed from: l2, reason: collision with root package name */
    public static final l f5490l2;

    /* renamed from: m, reason: collision with root package name */
    public static final l f5491m;

    /* renamed from: m0, reason: collision with root package name */
    public static final l f5492m0;

    /* renamed from: m1, reason: collision with root package name */
    public static final l f5493m1;

    /* renamed from: m2, reason: collision with root package name */
    public static final l f5494m2;

    /* renamed from: n, reason: collision with root package name */
    public static final l f5495n;

    /* renamed from: n0, reason: collision with root package name */
    public static final l f5496n0;

    /* renamed from: n1, reason: collision with root package name */
    public static final l f5497n1;

    /* renamed from: n2, reason: collision with root package name */
    public static final l f5498n2;

    /* renamed from: o0, reason: collision with root package name */
    public static final l f5499o0;

    /* renamed from: o1, reason: collision with root package name */
    public static final l f5500o1;

    /* renamed from: o2, reason: collision with root package name */
    public static final l f5501o2;

    /* renamed from: p, reason: collision with root package name */
    public static final l f5502p;

    /* renamed from: p0, reason: collision with root package name */
    public static final l f5503p0;

    /* renamed from: p1, reason: collision with root package name */
    public static final l f5504p1;

    /* renamed from: p2, reason: collision with root package name */
    public static final l f5505p2;

    /* renamed from: q, reason: collision with root package name */
    public static final l f5506q;

    /* renamed from: q0, reason: collision with root package name */
    public static final l f5507q0;

    /* renamed from: q1, reason: collision with root package name */
    public static final l f5508q1;

    /* renamed from: q2, reason: collision with root package name */
    public static final l f5509q2;

    /* renamed from: r, reason: collision with root package name */
    public static final l f5510r;

    /* renamed from: r0, reason: collision with root package name */
    public static final l f5511r0;

    /* renamed from: r1, reason: collision with root package name */
    public static final l f5512r1;

    /* renamed from: r2, reason: collision with root package name */
    public static final l f5513r2;

    /* renamed from: s, reason: collision with root package name */
    public static final l f5514s;

    /* renamed from: s0, reason: collision with root package name */
    public static final l f5515s0;

    /* renamed from: s1, reason: collision with root package name */
    public static final l f5516s1;

    /* renamed from: s2, reason: collision with root package name */
    public static final l f5517s2;

    /* renamed from: t, reason: collision with root package name */
    public static final l f5518t;

    /* renamed from: t0, reason: collision with root package name */
    public static final l f5519t0;

    /* renamed from: t1, reason: collision with root package name */
    public static final l f5520t1;

    /* renamed from: t2, reason: collision with root package name */
    public static final l f5521t2;

    /* renamed from: u0, reason: collision with root package name */
    public static final l f5522u0;

    /* renamed from: u1, reason: collision with root package name */
    public static final l f5523u1;

    /* renamed from: u2, reason: collision with root package name */
    public static final l f5524u2;

    /* renamed from: v, reason: collision with root package name */
    public static final l f5525v;

    /* renamed from: v0, reason: collision with root package name */
    public static final l f5526v0;

    /* renamed from: v1, reason: collision with root package name */
    public static final l f5527v1;

    /* renamed from: v2, reason: collision with root package name */
    public static final l f5528v2;

    /* renamed from: w, reason: collision with root package name */
    public static final l f5529w;

    /* renamed from: w0, reason: collision with root package name */
    public static final l f5530w0;

    /* renamed from: w1, reason: collision with root package name */
    public static final l f5531w1;

    /* renamed from: w2, reason: collision with root package name */
    public static final l f5532w2;

    /* renamed from: x, reason: collision with root package name */
    public static final l f5533x;

    /* renamed from: x0, reason: collision with root package name */
    public static final l f5534x0;

    /* renamed from: x1, reason: collision with root package name */
    public static final l f5535x1;

    /* renamed from: x2, reason: collision with root package name */
    public static final l f5536x2;

    /* renamed from: y, reason: collision with root package name */
    public static final l f5537y;

    /* renamed from: y0, reason: collision with root package name */
    public static final l f5538y0;

    /* renamed from: y1, reason: collision with root package name */
    public static final l f5539y1;

    /* renamed from: y2, reason: collision with root package name */
    public static final l f5540y2;

    /* renamed from: z, reason: collision with root package name */
    public static final l f5541z;

    /* renamed from: z0, reason: collision with root package name */
    public static final l f5542z0;

    /* renamed from: z1, reason: collision with root package name */
    public static final l f5543z1;

    /* renamed from: z2, reason: collision with root package name */
    public static final l f5544z2;

    /* renamed from: b, reason: collision with root package name */
    public final String f5545b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5546c;

    /* renamed from: d, reason: collision with root package name */
    public static final ConcurrentHashMap f5456d = new ConcurrentHashMap(8192);

    /* renamed from: e, reason: collision with root package name */
    public static final HashMap f5460e = new HashMap(768);

    /* renamed from: f, reason: collision with root package name */
    public static final l f5464f = new l("A");

    static {
        new l("AA");
        new l("AbsoluteColorimetric");
        new l("AC");
        new l("AcroForm");
        f5468g = new l("ActualText");
        new l("adbe.pkcs7.detached");
        new l("adbe.pkcs7.sha1");
        new l("adbe.x509.rsa_sha1");
        new l("Adobe.PPKLite");
        f5472h = new l("AESV2");
        f5479j = new l("AESV3");
        new l("After");
        new l("AIMetaData");
        new l("AIS");
        new l("AllOff");
        new l("AllOn");
        f5483k = new l("Alt");
        f5487l = k.a("Alpha", "Alternate", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.M);
        new l("Annots");
        new l("AntiAlias");
        new l("AnyOff");
        new l("AnyOn");
        new l("AP");
        new l("APRef");
        new l("App");
        new l("ArtBox");
        f5491m = new l("Artifact");
        f5495n = j.a("AS", "Ascent");
        f5502p = new l("ASCIIHexDecode");
        f5506q = new l("AHx");
        f5510r = new l("ASCII85Decode");
        f5514s = new l("A85");
        f5518t = new l("Attached");
        f5525v = new l("Author");
        new l("AvgWidth");
        new l("B");
        new l("Background");
        new l("BaseEncoding");
        f5529w = new l("BaseFont");
        f5533x = j.a("BaseState", "BBox");
        new l(BouncyCastleProvider.PROVIDER_NAME);
        new l("BE");
        new l("Before");
        new l("BG");
        f5537y = new l("BitsPerComponent");
        new l("BitsPerCoordinate");
        new l("BitsPerFlag");
        new l("BitsPerSample");
        f5541z = new l("BlackIs1");
        A = k.a("BlackPoint", "BleedBox", "BM");
        new l("Border");
        new l("Bounds");
        new l("BPC");
        new l("BS");
        new l("Btn");
        B = new l("ByteRange");
        C = new l("C");
        D = k.a("C0", "C1", "CA");
        new l("ca");
        new l("CalGray");
        new l("CalRGB");
        new l("Cap");
        E = new l("CapHeight");
        F = new l("Catalog");
        G = new l("CCITTFaxDecode");
        H = new l("CCF");
        I = k.a("CenterWindow", "Cert", "CF");
        K = new l("CFM");
        new l("Ch");
        new l("CharProcs");
        new l("CharSet");
        new l("CI");
        new l("CICI.SignIt");
        L = j.a("CIDFontType0", "CIDFontType2");
        M = new l("CIDToGIDMap");
        N = new l("CIDSet");
        O = new l("CIDSystemInfo");
        new l("CL");
        new l("ClrF");
        new l("ClrFf");
        new l("CMap");
        new l("CMapName");
        P = k.a("CMYK", "CO", "Color");
        new l("Collection");
        new l("CollectionItem");
        new l("CollectionField");
        new l("CollectionSchema");
        new l("CollectionSort");
        Q = j.a("CollectionSubitem", "ColorBurn");
        R = new l("ColorDodge");
        S = j.a("Colorants", "Colors");
        T = new l("ColorSpace");
        U = new l("Columns");
        V = new l("Compatible");
        W = k.a("Components", "ContactInfo", "Contents");
        X = j.a("Coords", "Count");
        Y = j.a("CP", "CreationDate");
        Z = new l("Creator");
        f5447a0 = new l("CropBox");
        f5450b0 = new l("Crypt");
        f5453c0 = j.a("CS", kf.a.f16304c);
        f5457d0 = j.a("DA", "Darken");
        f5461e0 = j.a("Date", "DCTDecode");
        f5465f0 = new l("DCT");
        f5469g0 = new l("Decode");
        f5473h0 = new l("DecodeParms");
        f5476i0 = k.a("default", "DefaultCMYK", "DefaultCryptFilter");
        new l("DefaultGray");
        new l("DefaultRGB");
        new l("Desc");
        f5480j0 = new l("DescendantFonts");
        f5484k0 = new l("Descent");
        f5488l0 = new l("Dest");
        new l("DestOutputProfile");
        new l("Dests");
        new l("DeviceCMYK");
        new l("DeviceGray");
        new l("DeviceN");
        f5492m0 = new l("DeviceRGB");
        f5496n0 = j.a("Di", "Difference");
        new l("Differences");
        new l("DigestMethod");
        new l("RIPEMD160");
        new l("SHA1");
        new l("SHA256");
        new l("SHA384");
        new l("SHA512");
        new l("Direction");
        new l("DisplayDocTitle");
        new l(ASN1Encoding.DL);
        f5499o0 = k.a("Dm", "Doc", "DocChecksum");
        f5503p0 = new l("DocTimeStamp");
        new l("DocMDP");
        new l(com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f7009a);
        new l("Domain");
        new l("DOS");
        f5507q0 = new l("DP");
        new l("DR");
        new l("DS");
        new l("Duplex");
        new l("Dur");
        new l("DV");
        f5511r0 = j.a("DW", "DW2");
        f5515s0 = new l("E");
        f5519t0 = new l("EarlyChange");
        new l("EF");
        new l("EmbeddedFDFs");
        new l("EmbeddedFiles");
        new l("");
        new l("Encode");
        f5522u0 = new l("EncodedByteAlign");
        f5526v0 = new l("Encoding");
        new l("90ms-RKSJ-H");
        new l("90ms-RKSJ-V");
        new l("ETen-B5-H");
        new l("ETen-B5-V");
        f5530w0 = new l("Encrypt");
        f5534x0 = new l("EncryptMetadata");
        f5538y0 = k.a("EndOfLine", "Entrust.PPKEF", "Exclusion");
        f5542z0 = new l("ExtGState");
        A0 = k.a("Extend", "Extends", "F");
        new l("FDecodeParms");
        new l("FFilter");
        new l("FB");
        new l("FDF");
        new l("Ff");
        B0 = k.a("Fields", "Filespec", "Filter");
        C0 = new l("First");
        new l("FirstChar");
        new l("FitWindow");
        new l("FL");
        D0 = new l("Flags");
        E0 = new l("FlateDecode");
        F0 = new l("Fl");
        G0 = j.a("Folders", "Font");
        H0 = new l("FontBBox");
        I0 = new l("FontDescriptor");
        J0 = new l("FontFamily");
        K0 = new l("FontFile");
        L0 = new l("FontFile2");
        M0 = new l("FontFile3");
        N0 = j.a("FontMatrix", "FontName");
        O0 = j.a("FontStretch", "FontWeight");
        P0 = new l(com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.W);
        new l("FormType");
        new l("FRM");
        new l("FT");
        new l("Function");
        new l("FunctionType");
        new l("Functions");
        new l("G");
        new l("Gamma");
        Q0 = new l("Group");
        R0 = j.a("GTS_PDFA1", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f7022n);
        S0 = new l("HardLight");
        T0 = new l("Height");
        new l("Helv");
        new l("HideMenubar");
        new l("HideToolbar");
        new l("HideWindowUI");
        U0 = new l("Hue");
        new l("I");
        new l("IC");
        new l("ICCBased");
        V0 = new l("ID");
        W0 = new l("IDTree");
        X0 = new l("Identity");
        Y0 = new l("Identity-H");
        Z0 = new l("Identity-V");
        new l("IF");
        new l("Illustrator");
        new l("IM");
        f5448a1 = new l("Image");
        f5451b1 = new l("ImageMask");
        f5454c1 = new l(com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f7018j);
        f5458d1 = j.a("Indexed", "Info");
        new l("InkList");
        new l("Intent");
        new l("Interpolate");
        new l("IT");
        f5462e1 = new l("ItalicAngle");
        new l("Issuer");
        new l("IX");
        new l("JavaScript");
        new l("JBIG2Decode");
        new l("JBIG2Globals");
        f5466f1 = new l("JPXDecode");
        f5470g1 = j.a("JS", "K");
        f5474h1 = new l("Keywords");
        f5477i1 = j.a("KeyUsage", "Kids");
        f5481j1 = k.a(com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f7029u, "Lab", "Lang");
        new l("Last");
        new l("LastChar");
        new l("LastModified");
        new l("LC");
        new l("LE");
        f5485k1 = k.a("Leading", "LegalAttestation", "Length");
        f5489l1 = new l("Length1");
        f5493m1 = j.a("Length2", "Lighten");
        new l("Limits");
        new l("LJ");
        new l("LL");
        new l("LLE");
        new l("LLO");
        f5497n1 = j.a("Location", "Luminosity");
        f5500o1 = j.a("LW", "LZWDecode");
        f5504p1 = new l("LZW");
        new l("M");
        new l("Mac");
        new l("MacExpertEncoding");
        new l("MacRomanEncoding");
        new l("MarkInfo");
        new l("Mask");
        new l("Matrix");
        new l("Matte");
        new l("MaxLen");
        new l("MaxWidth");
        f5508q1 = new l("MCID");
        f5512r1 = j.a("MDP", "MediaBox");
        f5516s1 = j.a("Measure", "Metadata");
        new l("MissingWidth");
        new l("Mix");
        new l("MK");
        new l("ML");
        new l("MMType1");
        f5520t1 = new l("ModDate");
        f5523u1 = new l("Multiply");
        f5527v1 = new l("N");
        f5531w1 = new l("Name");
        new l("Names");
        new l("Navigator");
        new l("NeedAppearances");
        new l("NewWindow");
        new l("Next");
        new l("NM");
        new l("NonEFontNoWarn");
        new l("NonFullScreenPageMode");
        new l("None");
        f5535x1 = new l(com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.d.f6965t0);
        f5539y1 = j.a("Nums", "O");
        f5543z1 = new l("Obj");
        A1 = new l("ObjStm");
        B1 = j.a("OC", "OCG");
        C1 = j.a("OCGs", "OCMD");
        D1 = j.a("OCProperties", "OE");
        new l("OID");
        new l("OFF");
        new l("Off");
        new l("ON");
        new l("OP");
        new l("op");
        new l("OpenAction");
        new l("OpenType");
        new l("OPM");
        new l("Opt");
        E1 = j.a("Order", "Ordering");
        new l("OS");
        new l("Outlines");
        new l("OutputCondition");
        new l("OutputConditionIdentifier");
        new l("OutputIntent");
        F1 = j.a("OutputIntents", "Overlay");
        G1 = new l(com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f7021m);
        H1 = new l("Page");
        new l("PageLabels");
        new l("PageLayout");
        new l("PageMode");
        I1 = new l("Pages");
        J1 = j.a("PaintType", "Panose");
        K1 = j.a("Params", "Parent");
        L1 = new l("ParentTree");
        M1 = new l("ParentTreeNextKey");
        new l(com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f7010b);
        new l("Path");
        new l("Pattern");
        new l("PatternType");
        new l("PDFDocEncoding");
        N1 = new l("Perms");
        O1 = k.a("Perceptual", "PieceInfo", "Pg");
        P1 = j.a("PreRelease", "Predictor");
        Q1 = new l("Prev");
        new l("PrintArea");
        new l("PrintClip");
        new l("PrintScaling");
        new l(com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f7020l);
        new l("ProcSet");
        R1 = j.a("Process", "Producer");
        S1 = k.a("Prop_Build", "Properties", "PS");
        new l("PubSec");
        new l("Q");
        new l("QuadPoints");
        T1 = new l("R");
        new l("Range");
        new l("RC");
        new l("RD");
        new l("Reason");
        new l("Reasons");
        U1 = k.a("RelativeColorimetric", "Repeat", "Recipients");
        V1 = k.a("Rect", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.I, "Registry");
        W1 = k.a("RegistryName", "Rename", "Resources");
        X1 = k.a("RGB", "RI", "RoleMap");
        Y1 = new l("Root");
        Z1 = new l("Rotate");
        f5449a2 = new l("Rows");
        f5452b2 = new l("RunLengthDecode");
        f5455c2 = new l("RL");
        f5459d2 = j.a("RV", kf.a.f16303b);
        f5463e2 = j.a("SA", "Saturation");
        f5467f2 = j.a("Schema", "Screen");
        new l("SE");
        new l("Separation");
        new l("SetF");
        new l("SetFf");
        new l("Shading");
        f5471g2 = j.a("ShadingType", "Sig");
        f5475h2 = k.a("SigFlags", "SigRef", "Size");
        f5478i2 = k.a("SM", "SMask", "SoftLight");
        new l("Sort");
        new l("Sound");
        new l("Split");
        new l("SS");
        new l("St");
        new l("StandardEncoding");
        new l("State");
        new l("StateModel");
        new l("Status");
        f5482j2 = new l("StdCF");
        f5486k2 = j.a("StemH", "StemV");
        f5490l2 = new l("StmF");
        f5494m2 = new l("StrF");
        new l(com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure.g.f6919b);
        new l("StructParent");
        new l("StructParents");
        new l("StructTreeRoot");
        f5498n2 = new l("Style");
        f5501o2 = new l("SubFilter");
        f5505p2 = j.a("Subj", "Subject");
        f5509q2 = j.a("SubjectDN", "Subtype");
        f5513r2 = new l("Supplement");
        new l("SV");
        new l("SVCert");
        new l("SW");
        new l("Sy");
        new l("Synchronous");
        f5517s2 = new l("T");
        new l("Target");
        new l("Templates");
        new l("Threads");
        new l("Thumb");
        new l("TI");
        f5521t2 = k.a("TilingType", "TimeStamp", "Title");
        f5524u2 = k.a("TK", "TM", "ToUnicode");
        new l(com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f7034z);
        new l("TR2");
        new l("Trapped");
        new l("Trans");
        new l("TransformMethod");
        f5528v2 = j.a("TransformParams", "Transparency");
        new l("TRef");
        new l("TrimBox");
        new l("TrueType");
        new l("TrustedMode");
        new l("TU");
        f5532w2 = j.a("Tx", "Type");
        f5536x2 = new l("Type0");
        f5540y2 = k.a("Type1", "Type3", "U");
        f5544z2 = new l("UE");
        new l("UF");
        new l("Unchanged");
        new l("Unix");
        new l("URI");
        new l("URL");
        A2 = k.a("URLType", "UserUnit", "V");
        B2 = k.a("VE", "VeriSign.PPKVS", "Version");
        new l("Vertices");
        new l("VerticesPerRow");
        new l("View");
        new l("ViewArea");
        new l("ViewClip");
        new l("ViewerPreferences");
        new l("Volume");
        new l("VP");
        C2 = new l("W");
        D2 = new l("W2");
        E2 = k.a("WhitePoint", "Widget", "Width");
        new l("Widths");
        new l("WinAnsiEncoding");
        new l("XFA");
        new l("XStep");
        F2 = new l("XHeight");
        G2 = new l("XObject");
        H2 = new l("XRef");
        I2 = new l("XRefStm");
        new l("YStep");
        new l("Yes");
        new l("ZaDb");
    }

    public l(String str, boolean z10) {
        this.f5545b = str;
        this.f5546c = str.hashCode();
        if (z10) {
            f5460e.put(str, this);
        } else {
            f5456d.put(str, this);
        }
    }

    public static l g0(String str) {
        if (str == null) {
            return null;
        }
        l lVar = (l) f5460e.get(str);
        if (lVar != null) {
            return lVar;
        }
        l lVar2 = (l) f5456d.get(str);
        return lVar2 == null ? new l(str, false) : lVar2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(l lVar) {
        return this.f5545b.compareTo(lVar.f5545b);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            return this.f5545b.equals(((l) obj).f5545b);
        }
        return false;
    }

    @Override // cf.b
    public final Object f0(gf.b bVar) throws IOException {
        i0(bVar.f12056d);
        return null;
    }

    public final int hashCode() {
        return this.f5546c;
    }

    public final void i0(OutputStream outputStream) throws IOException {
        outputStream.write(47);
        for (byte b10 : this.f5545b.getBytes(wf.a.f31525f)) {
            int i10 = b10 & 255;
            if ((i10 < 65 || i10 > 90) && ((i10 < 97 || i10 > 122) && !((i10 >= 48 && i10 <= 57) || i10 == 43 || i10 == 45 || i10 == 95 || i10 == 64 || i10 == 42 || i10 == 36 || i10 == 59 || i10 == 46))) {
                outputStream.write(35);
                wf.b.b(b10, outputStream);
            } else {
                outputStream.write(i10);
            }
        }
    }

    public final String toString() {
        return b.o.a(new StringBuilder("COSName{"), this.f5545b, "}");
    }

    public l(String str) {
        this(str, true);
    }
}
