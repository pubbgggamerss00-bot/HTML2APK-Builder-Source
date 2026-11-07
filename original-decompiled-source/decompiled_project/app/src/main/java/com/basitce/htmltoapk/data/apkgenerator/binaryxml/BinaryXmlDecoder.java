package com.basitce.htmltoapk.data.apkgenerator.binaryxml;

import i8.n;
import j2.y;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.r;
import lh.g;
import lh.k;
import mh.t;
import qg.l;
import qg.x;
import qg.z;
import r1.f;

/* loaded from: classes.dex */
public final class BinaryXmlDecoder {
    public static final int $stable = 0;
    public static final BinaryXmlDecoder INSTANCE = new BinaryXmlDecoder();

    public static final class Attribute {
        public static final int $stable = 0;
        private final int data;
        private final String name;
        private final String namespace;
        private final int resourceId;
        private final String string;
        private final int type;

        public Attribute(String str, String name, int i10, int i11, int i12, String str2) {
            r.e(name, "name");
            this.namespace = str;
            this.name = name;
            this.resourceId = i10;
            this.type = i11;
            this.data = i12;
            this.string = str2;
        }

        public final String display() {
            int i10 = this.type;
            if (i10 == 1) {
                return String.format("@0x%08x", Arrays.copyOf(new Object[]{Integer.valueOf(this.data)}, 1));
            }
            if (i10 == 3) {
                return n.d("\"", this.string, "\"");
            }
            switch (i10) {
                case 16:
                    return String.valueOf(this.data);
                case 17:
                    return String.format("0x%08x", Arrays.copyOf(new Object[]{Integer.valueOf(this.data)}, 1));
                case 18:
                    return String.valueOf(this.data != 0);
                default:
                    return String.format("(type 0x%02x)0x%08x", Arrays.copyOf(new Object[]{Integer.valueOf(i10), Integer.valueOf(this.data)}, 2));
            }
        }

        public final int getData() {
            return this.data;
        }

        public final String getName() {
            return this.name;
        }

        public final String getNamespace() {
            return this.namespace;
        }

        public final int getResourceId() {
            return this.resourceId;
        }

        public final String getString() {
            return this.string;
        }

        public final int getType() {
            return this.type;
        }
    }

    public static final class Builder {
        private final List<Attribute> attributes;
        private final List<Element> children;
        private final int line;
        private final String name;
        private final String namespace;

        public Builder(String str, String name, int i10, List<Attribute> attributes) {
            r.e(name, "name");
            r.e(attributes, "attributes");
            this.namespace = str;
            this.name = name;
            this.line = i10;
            this.attributes = attributes;
            this.children = new ArrayList();
        }

        public final Element build() {
            return new Element(this.namespace, this.name, this.line, this.attributes, this.children);
        }

        public final List<Attribute> getAttributes() {
            return this.attributes;
        }

        public final List<Element> getChildren() {
            return this.children;
        }

        public final int getLine() {
            return this.line;
        }

        public final String getName() {
            return this.name;
        }

        public final String getNamespace() {
            return this.namespace;
        }
    }

    public static final class Element {
        public static final int $stable = 8;
        private final List<Attribute> attributes;
        private final List<Element> children;
        private final int line;
        private final String name;
        private final String namespace;

        public Element(String str, String name, int i10, List<Attribute> attributes, List<Element> children) {
            r.e(name, "name");
            r.e(attributes, "attributes");
            r.e(children, "children");
            this.namespace = str;
            this.name = name;
            this.line = i10;
            this.attributes = attributes;
            this.children = children;
        }

        public static /* synthetic */ Attribute attribute$default(Element element, String str, String str2, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                str2 = AndroidManifestAttrs.NAMESPACE;
            }
            return element.attribute(str, str2);
        }

        public final Attribute attribute(String name, String str) {
            Object next;
            r.e(name, "name");
            Iterator<T> it = this.attributes.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                Attribute attribute = (Attribute) next;
                if (r.a(attribute.getName(), name) && r.a(attribute.getNamespace(), str)) {
                    break;
                }
            }
            return (Attribute) next;
        }

        public final g<Element> descendants() {
            return new k(new BinaryXmlDecoder$Element$descendants$1(this, null));
        }

        public final List<Attribute> getAttributes() {
            return this.attributes;
        }

        public final List<Element> getChildren() {
            return this.children;
        }

        public final int getLine() {
            return this.line;
        }

        public final String getName() {
            return this.name;
        }

        public final String getNamespace() {
            return this.namespace;
        }
    }

    private BinaryXmlDecoder() {
    }

    private static final String decode$string(g0<List<String>> g0Var, int i10) {
        if (i10 == -1) {
            return null;
        }
        String str = (String) x.E(i10, g0Var.f16327a);
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException(ad.b.b(i10, "String index ", " is out of range"));
    }

    private static final void dump$lambda$12$write(StringBuilder sb, Element element, int i10) {
        String strL = t.l(i10, "  ");
        sb.append(strL);
        sb.append("E: ");
        sb.append(element.getName());
        sb.append(" (line=");
        sb.append(element.getLine());
        sb.append(")\n");
        for (Attribute attribute : element.getAttributes()) {
            sb.append(strL);
            sb.append("  A: ");
            if (r.a(attribute.getNamespace(), AndroidManifestAttrs.NAMESPACE)) {
                sb.append("android:");
            } else {
                String namespace = attribute.getNamespace();
                if (namespace != null) {
                    sb.append(namespace);
                    sb.append(':');
                }
            }
            sb.append(attribute.getName());
            if (attribute.getResourceId() != 0) {
                sb.append(String.format("(0x%08x)", Arrays.copyOf(new Object[]{Integer.valueOf(attribute.getResourceId())}, 1)));
            }
            sb.append('=');
            sb.append(attribute.display());
            sb.append('\n');
        }
        Iterator<T> it = element.getChildren().iterator();
        while (it.hasNext()) {
            dump$lambda$12$write(sb, (Element) it.next(), i10 + 1);
        }
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [T, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v1, types: [T, qg.z] */
    public final Element decode(byte[] bytes) {
        int i10;
        char c10;
        Element element;
        List<Element> children;
        r.e(bytes, "bytes");
        LittleEndianReader littleEndianReader = new LittleEndianReader(bytes);
        int i11 = 8;
        if (littleEndianReader.getSize() < 8 || littleEndianReader.u16(0) != 3) {
            throw new IllegalArgumentException("Not an Android binary XML file");
        }
        char c11 = 4;
        if (littleEndianReader.u32(4) != littleEndianReader.getSize()) {
            throw new IllegalArgumentException(f.a(littleEndianReader.u32(4), littleEndianReader.getSize(), "Binary XML size ", " does not match ", " bytes").toString());
        }
        g0 g0Var = new g0();
        g0Var.f16327a = z.f22752a;
        int[] iArr = new int[0];
        l lVar = new l();
        int iU16 = littleEndianReader.u16(2);
        Element element2 = null;
        while (iU16 < littleEndianReader.getSize()) {
            int iU162 = littleEndianReader.u16(iU16);
            int iU163 = littleEndianReader.u16(iU16 + 2);
            int iU32 = littleEndianReader.u32(iU16 + 4);
            if (iU32 < i11 || (i10 = iU16 + iU32) > littleEndianReader.getSize()) {
                throw new IllegalArgumentException(y.a(iU16, "Corrupt chunk at ").toString());
            }
            if (iU162 == 1) {
                c10 = c11;
                element = element2;
                g0Var.f16327a = BinaryXmlFormatKt.readStringPool(littleEndianReader, iU16);
            } else if (iU162 == 384) {
                c10 = c11;
                element = element2;
                int i12 = (iU32 - iU163) / 4;
                int[] iArr2 = new int[i12];
                for (int i13 = 0; i13 < i12; i13++) {
                    iArr2[i13] = littleEndianReader.u32((i13 * 4) + iU16 + iU163);
                }
                iArr = iArr2;
            } else if (iU162 != 258) {
                if (iU162 == 259) {
                    Object objRemoveLast = lVar.isEmpty() ? null : lVar.removeLast();
                    if (objRemoveLast == null) {
                        throw new IllegalArgumentException(y.a(iU16, "Unbalanced end element at ").toString());
                    }
                    Element elementBuild = ((Builder) objRemoveLast).build();
                    Builder builder = (Builder) lVar.k();
                    if (builder == null || (children = builder.getChildren()) == null) {
                        c10 = c11;
                        element2 = elementBuild;
                        iU16 = i10;
                        c11 = c10;
                        i11 = 8;
                    } else {
                        children.add(elementBuild);
                    }
                }
                c10 = c11;
                element = element2;
            } else {
                int i14 = iU163 + iU16;
                int iU164 = littleEndianReader.u16(i14 + 8);
                int iU165 = littleEndianReader.u16(i14 + 10);
                int iU166 = littleEndianReader.u16(i14 + 12);
                ArrayList arrayList = new ArrayList(iU166);
                int i15 = 0;
                while (i15 < iU166) {
                    char c12 = c11;
                    int i16 = (i15 * iU165) + i14 + iU164;
                    int iU322 = littleEndianReader.u32(i16 + 4);
                    int i17 = i15;
                    int iU8 = littleEndianReader.u8(i16 + 15);
                    Element element3 = element2;
                    int iU323 = littleEndianReader.u32(i16 + 16);
                    int i18 = iU164;
                    String strDecode$string = decode$string(g0Var, littleEndianReader.u32(i16));
                    String strDecode$string2 = decode$string(g0Var, iU322);
                    if (strDecode$string2 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    arrayList.add(new Attribute(strDecode$string, strDecode$string2, (iU322 < 0 || iU322 >= iArr.length) ? 0 : iArr[iU322], iU8, iU323, iU8 == 3 ? decode$string(g0Var, iU323) : decode$string(g0Var, littleEndianReader.u32(i16 + 8))));
                    i15 = i17 + 1;
                    c11 = c12;
                    element2 = element3;
                    iU164 = i18;
                }
                c10 = c11;
                element = element2;
                String strDecode$string3 = decode$string(g0Var, littleEndianReader.u32(i14));
                String strDecode$string4 = decode$string(g0Var, littleEndianReader.u32(i14 + 4));
                if (strDecode$string4 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                lVar.addLast(new Builder(strDecode$string3, strDecode$string4, littleEndianReader.u32(iU16 + 8), arrayList));
            }
            element2 = element;
            iU16 = i10;
            c11 = c10;
            i11 = 8;
        }
        Element element4 = element2;
        if (!lVar.isEmpty()) {
            throw new IllegalArgumentException(n.d("Binary XML ends inside <", ((Builder) lVar.last()).getName(), ">").toString());
        }
        if (element4 != null) {
            return element4;
        }
        throw new IllegalArgumentException("Binary XML has no root element");
    }

    public final String dump(Element root) {
        r.e(root, "root");
        StringBuilder sb = new StringBuilder();
        dump$lambda$12$write(sb, root, 0);
        return sb.toString();
    }
}
