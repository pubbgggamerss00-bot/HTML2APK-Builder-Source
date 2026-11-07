package com.basitce.htmltoapk.data.apkgenerator.binaryxml;

import com.basitce.htmltoapk.data.apkgenerator.binaryxml.BinaryXmlEncoder;
import eh.l;
import g8.w;
import i0.x1;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import javax.xml.parsers.SAXParserFactory;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.r;
import mh.i;
import mh.k;
import mh.t;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import p5.g0;
import pg.n;
import qg.k0;
import qg.l0;
import qg.p;
import qg.x;

/* loaded from: classes.dex */
public final class BinaryXmlEncoder {
    public static final BinaryXmlEncoder INSTANCE = new BinaryXmlEncoder();
    private static final k reference = new k("@0x([0-9a-fA-F]{8})");
    private static final k hex = new k("0x[0-9a-fA-F]{1,8}");
    private static final k decimal = new k("-?[0-9]{1,10}");
    private static final Comparator<Attr> attributeOrder = new c();
    public static final int $stable = 8;

    public static final class Attr {
        private final String name;
        private final String namespace;
        private final int resourceId;
        private final Value value;

        public Attr(String str, String name, int i10, Value value) {
            r.e(name, "name");
            r.e(value, "value");
            this.namespace = str;
            this.name = name;
            this.resourceId = i10;
            this.value = value;
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

        public final Value getValue() {
            return this.value;
        }
    }

    public static final class Element {
        private final List<Attr> attrs;
        private final List<Element> children;
        private final int line;
        private final String name;
        private final String namespace;
        private final List<Namespace> namespaces;

        public Element(String str, String name, int i10, List<Namespace> namespaces, List<Attr> attrs) {
            r.e(name, "name");
            r.e(namespaces, "namespaces");
            r.e(attrs, "attrs");
            this.namespace = str;
            this.name = name;
            this.line = i10;
            this.namespaces = namespaces;
            this.attrs = attrs;
            this.children = new ArrayList();
        }

        public final List<Attr> getAttrs() {
            return this.attrs;
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

        public final List<Namespace> getNamespaces() {
            return this.namespaces;
        }
    }

    public static final class Namespace {
        private final String prefix;
        private final String uri;

        public Namespace(String prefix, String uri) {
            r.e(prefix, "prefix");
            r.e(uri, "uri");
            this.prefix = prefix;
            this.uri = uri;
        }

        public final String getPrefix() {
            return this.prefix;
        }

        public final String getUri() {
            return this.uri;
        }
    }

    public static final class StringTable {
        private final List<n<String, Integer>> attributeNames;
        private final LinkedHashMap<String, Integer> others;

        public StringTable(Element root) {
            r.e(root, "root");
            this.attributeNames = new ArrayList();
            this.others = new LinkedHashMap<>();
            TreeMap treeMap = new TreeMap(new d());
            k0.h(treeMap, new n[0]);
            _init_$collectIds(treeMap, root);
            for (Map.Entry entry : treeMap.entrySet()) {
                Integer num = (Integer) entry.getKey();
                this.attributeNames.add(new n<>((String) entry.getValue(), num));
            }
            _init_$collectStrings(this, root);
        }

        private static final void _init_$collectIds(SortedMap<Integer, String> sortedMap, Element element) {
            List<Attr> attrs = element.getAttrs();
            ArrayList arrayList = new ArrayList();
            for (Object obj : attrs) {
                if (((Attr) obj).getResourceId() != 0) {
                    arrayList.add(obj);
                }
            }
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj2 = arrayList.get(i10);
                i10++;
                Attr attr = (Attr) obj2;
                sortedMap.put(Integer.valueOf(attr.getResourceId()), attr.getName());
            }
            Iterator<T> it = element.getChildren().iterator();
            while (it.hasNext()) {
                _init_$collectIds(sortedMap, (Element) it.next());
            }
        }

        private static final void _init_$collectStrings(StringTable stringTable, Element element) {
            for (Namespace namespace : element.getNamespaces()) {
                stringTable.other(namespace.getPrefix());
                stringTable.other(namespace.getUri());
            }
            String namespace2 = element.getNamespace();
            if (namespace2 != null) {
                stringTable.other(namespace2);
            }
            stringTable.other(element.getName());
            for (Attr attr : element.getAttrs()) {
                String namespace3 = attr.getNamespace();
                if (namespace3 != null) {
                    stringTable.other(namespace3);
                }
                if (attr.getResourceId() == 0) {
                    stringTable.other(attr.getName());
                }
                Value value = attr.getValue();
                Value.Text text = value instanceof Value.Text ? (Value.Text) value : null;
                if (text != null) {
                    stringTable.other(text.getText());
                }
            }
            Iterator<T> it = element.getChildren().iterator();
            while (it.hasNext()) {
                _init_$collectStrings(stringTable, (Element) it.next());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int _init_$lambda$0(Integer num, Integer num2) {
            r.b(num);
            int iIntValue = num.intValue();
            r.b(num2);
            return Integer.compareUnsigned(iIntValue, num2.intValue());
        }

        private final void other(String str) {
            LinkedHashMap<String, Integer> linkedHashMap = this.others;
            if (linkedHashMap.get(str) == null) {
                linkedHashMap.put(str, Integer.valueOf(this.others.size() + this.attributeNames.size()));
            }
        }

        public final int attributeName(Attr attr) {
            r.e(attr, "attr");
            if (attr.getResourceId() == 0) {
                return of(attr.getName());
            }
            Iterator<n<String, Integer>> it = this.attributeNames.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                if (it.next().f21470b.intValue() == attr.getResourceId()) {
                    return i10;
                }
                i10++;
            }
            return -1;
        }

        public final int of(String str) {
            if (str == null) {
                return -1;
            }
            Integer num = this.others.get(str);
            if (num != null) {
                return num.intValue();
            }
            throw new IllegalArgumentException("Required value was null.");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final byte[] poolChunk() throws IOException {
            List<n<String, Integer>> list = this.attributeNames;
            ArrayList arrayList = new ArrayList(p.h(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add((String) ((n) it.next()).f21469a);
            }
            Set<String> setKeySet = this.others.keySet();
            r.d(setKeySet, "<get-keys>(...)");
            ArrayList arrayListO = x.O(setKeySet, arrayList);
            LittleEndianWriter littleEndianWriter = new LittleEndianWriter();
            ArrayList arrayList2 = new ArrayList(p.h(arrayListO, 10));
            int size = arrayListO.size();
            int i10 = 0;
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayListO.get(i11);
                i11++;
                String str = (String) obj;
                int size2 = littleEndianWriter.getSize();
                int length = str.length();
                if (length > 32767) {
                    littleEndianWriter.u16((length >>> 16) | 32768);
                    littleEndianWriter.u16(length);
                } else {
                    littleEndianWriter.u16(length);
                }
                for (int i12 = 0; i12 < str.length(); i12++) {
                    littleEndianWriter.u16(str.charAt(i12));
                }
                littleEndianWriter.u16(0);
                arrayList2.add(Integer.valueOf(size2));
            }
            littleEndianWriter.padTo4();
            int size3 = (arrayList2.size() * 4) + 28;
            LittleEndianWriter littleEndianWriter2 = new LittleEndianWriter();
            littleEndianWriter2.u16(1);
            littleEndianWriter2.u16(28);
            littleEndianWriter2.u32(littleEndianWriter.getSize() + size3);
            littleEndianWriter2.u32(arrayListO.size());
            littleEndianWriter2.u32(0);
            littleEndianWriter2.u32(0);
            littleEndianWriter2.u32(size3);
            littleEndianWriter2.u32(0);
            int size4 = arrayList2.size();
            while (i10 < size4) {
                Object obj2 = arrayList2.get(i10);
                i10++;
                littleEndianWriter2.u32(((Number) obj2).intValue());
            }
            littleEndianWriter2.bytes(littleEndianWriter.toByteArray());
            return littleEndianWriter2.toByteArray();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final byte[] resourceMapChunk() {
            LittleEndianWriter littleEndianWriter = new LittleEndianWriter();
            littleEndianWriter.u16(384);
            littleEndianWriter.u16(8);
            littleEndianWriter.u32((this.attributeNames.size() * 4) + 8);
            Iterator<T> it = this.attributeNames.iterator();
            while (it.hasNext()) {
                littleEndianWriter.u32(((Number) ((n) it.next()).f21470b).intValue());
            }
            return littleEndianWriter.toByteArray();
        }
    }

    public static abstract class Value {

        public static final class Text extends Value {
            public static final int $stable = 0;
            private final String text;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Text(String text) {
                super(null);
                r.e(text, "text");
                this.text = text;
            }

            public final String getText() {
                return this.text;
            }
        }

        public static final class Typed extends Value {
            public static final int $stable = 0;
            private final int data;
            private final int type;

            public Typed(int i10, int i11) {
                super(null);
                this.type = i10;
                this.data = i11;
            }

            public final int getData() {
                return this.data;
            }

            public final int getType() {
                return this.type;
            }
        }

        public /* synthetic */ Value(j jVar) {
            this();
        }

        private Value() {
        }
    }

    private BinaryXmlEncoder() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int attributeOrder$lambda$5(Attr attr, Attr attr2) {
        if (attr.getResourceId() != 0 && attr2.getResourceId() != 0) {
            return Integer.compareUnsigned(attr.getResourceId(), attr2.getResourceId());
        }
        if (attr.getResourceId() != 0) {
            return -1;
        }
        if (attr2.getResourceId() != 0) {
            return 1;
        }
        l[] lVarArr = {new a(), new b()};
        for (int i10 = 0; i10 < 2; i10++) {
            l lVar = lVarArr[i10];
            int iB = x1.b((Comparable) lVar.invoke(attr), (Comparable) lVar.invoke(attr2));
            if (iB != 0) {
                return iB;
            }
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Comparable attributeOrder$lambda$5$lambda$3(Attr attr) {
        String namespace = attr.getNamespace();
        return namespace == null ? "" : namespace;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.basitce.htmltoapk.data.apkgenerator.binaryxml.BinaryXmlEncoder$parse$handler$1, org.xml.sax.helpers.DefaultHandler] */
    private final Element parse(String str) throws SAXException, IOException {
        SAXParserFactory sAXParserFactoryNewInstance = SAXParserFactory.newInstance();
        sAXParserFactoryNewInstance.setNamespaceAware(true);
        ?? r12 = new DefaultHandler() { // from class: com.basitce.htmltoapk.data.apkgenerator.binaryxml.BinaryXmlEncoder$parse$handler$1
            private Locator locator;
            private BinaryXmlEncoder.Element root;
            private final qg.l<BinaryXmlEncoder.Element> stack = new qg.l<>();
            private final List<BinaryXmlEncoder.Namespace> pendingNamespaces = new ArrayList();

            @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
            public void characters(char[] ch2, int i10, int i11) {
                r.e(ch2, "ch");
                if (!mh.x.A(new String(ch2, i10, i11))) {
                    throw new IllegalArgumentException("Text content is not supported in a manifest");
                }
            }

            @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
            public void endElement(String uri, String localName, String qName) {
                r.e(uri, "uri");
                r.e(localName, "localName");
                r.e(qName, "qName");
                this.stack.removeLast();
            }

            public final Locator getLocator() {
                return this.locator;
            }

            public final List<BinaryXmlEncoder.Namespace> getPendingNamespaces() {
                return this.pendingNamespaces;
            }

            public final BinaryXmlEncoder.Element getRoot() {
                return this.root;
            }

            public final qg.l<BinaryXmlEncoder.Element> getStack() {
                return this.stack;
            }

            @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
            public void setDocumentLocator(Locator locator) {
                r.e(locator, "locator");
                this.locator = locator;
            }

            public final void setLocator(Locator locator) {
                this.locator = locator;
            }

            public final void setRoot(BinaryXmlEncoder.Element element) {
                this.root = element;
            }

            @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
            public void startElement(String uri, String localName, String qName, Attributes attributes) {
                List<BinaryXmlEncoder.Element> children;
                int lineNumber;
                r.e(uri, "uri");
                r.e(localName, "localName");
                r.e(qName, "qName");
                r.e(attributes, "attributes");
                int length = attributes.getLength();
                ArrayList arrayList = new ArrayList(length);
                int i10 = 0;
                while (true) {
                    String str2 = null;
                    if (i10 >= length) {
                        break;
                    }
                    BinaryXmlEncoder binaryXmlEncoder = BinaryXmlEncoder.INSTANCE;
                    String uri2 = attributes.getURI(i10);
                    if (uri2.length() != 0) {
                        str2 = uri2;
                    }
                    String localName2 = attributes.getLocalName(i10);
                    r.d(localName2, "getLocalName(...)");
                    String value = attributes.getValue(i10);
                    r.d(value, "getValue(...)");
                    arrayList.add(binaryXmlEncoder.typedAttr(str2, localName2, value));
                    i10++;
                }
                String str3 = uri.length() == 0 ? null : uri;
                Locator locator = this.locator;
                int i11 = 1;
                if (locator != null && (lineNumber = locator.getLineNumber()) >= 1) {
                    i11 = lineNumber;
                }
                BinaryXmlEncoder.Element element = new BinaryXmlEncoder.Element(str3, localName, i11, x.c0(this.pendingNamespaces), x.U(BinaryXmlEncoder.attributeOrder, arrayList));
                this.pendingNamespaces.clear();
                BinaryXmlEncoder.Element elementK = this.stack.k();
                if (elementK == null || (children = elementK.getChildren()) == null) {
                    this.root = element;
                } else {
                    children.add(element);
                }
                this.stack.addLast(element);
            }

            @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
            public void startPrefixMapping(String prefix, String uri) {
                r.e(prefix, "prefix");
                r.e(uri, "uri");
                this.pendingNamespaces.add(new BinaryXmlEncoder.Namespace(prefix, uri));
            }
        };
        sAXParserFactoryNewInstance.newSAXParser().parse(new InputSource(new StringReader(str)), (DefaultHandler) r12);
        Element root = r12.getRoot();
        if (root != null) {
            return root;
        }
        throw new IllegalArgumentException("Manifest XML has no root element");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Attr typedAttr(String str, String str2, String str3) throws NumberFormatException {
        int iIntValue;
        Value typed;
        Value typed2;
        boolean zA = r.a(str, AndroidManifestAttrs.NAMESPACE);
        if (zA) {
            Integer num = AndroidManifestAttrs.INSTANCE.getIds().get(str2);
            if (num == null) {
                throw new IllegalArgumentException(i8.n.d("android:", str2, " has no known attribute ID; add it to AndroidManifestAttrs").toString());
            }
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        i iVarD = reference.d(str3);
        if (iVarD != null) {
            String str4 = (String) ((i.a) iVarD.a()).get(1);
            w.h(16);
            typed2 = new Value.Typed(1, (int) Long.parseLong(str4, 16));
        } else {
            if (zA && AndroidManifestAttrs.INSTANCE.getStringAttrs().contains(str2)) {
                typed = new Value.Text(str3);
            } else {
                if (t.p(str3, "@", false)) {
                    throw new IllegalArgumentException(b6.a.b("Unresolved resource reference ", str3, " in ", str2));
                }
                if (str3.equals("true") || str3.equals("false")) {
                    typed = new Value.Typed(18, str3.equals("true") ? -1 : 0);
                } else if (hex.e(str3)) {
                    String strSubstring = str3.substring(2);
                    r.d(strSubstring, "substring(...)");
                    w.h(16);
                    typed = new Value.Typed(17, (int) Long.parseLong(strSubstring, 16));
                } else if (decimal.e(str3)) {
                    long j10 = Long.parseLong(str3);
                    if (-2147483648L <= j10 && j10 <= 2147483647L) {
                        typed = new Value.Typed(16, Integer.parseInt(str3));
                    } else {
                        if (zA) {
                            throw new IllegalArgumentException(g0.a("android:", str2, "=\"", str3, "\" is not a typed value"));
                        }
                        typed = new Value.Text(str3);
                    }
                }
            }
            typed2 = typed;
        }
        return new Attr(str, str2, iIntValue, typed2);
    }

    private final void writeElement(LittleEndianWriter littleEndianWriter, Element element, StringTable stringTable) {
        Iterator<T> it = element.getNamespaces().iterator();
        while (it.hasNext()) {
            INSTANCE.writeNamespace(littleEndianWriter, 256, (Namespace) it.next(), element.getLine(), stringTable);
        }
        if (element.getAttrs().size() > 65535) {
            throw new IllegalArgumentException(i8.n.d("Too many attributes on <", element.getName(), ">").toString());
        }
        writeNodeHeader(littleEndianWriter, 258, (element.getAttrs().size() * 20) + 36, element.getLine());
        littleEndianWriter.u32(stringTable.of(element.getNamespace()));
        littleEndianWriter.u32(stringTable.of(element.getName()));
        littleEndianWriter.u16(20);
        littleEndianWriter.u16(20);
        littleEndianWriter.u16(element.getAttrs().size());
        Iterator<Attr> it2 = element.getAttrs().iterator();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (!it2.hasNext()) {
                i11 = -1;
                break;
            }
            Attr next = it2.next();
            if (r.a(next.getNamespace(), AndroidManifestAttrs.NAMESPACE) && r.a(next.getName(), "id")) {
                break;
            } else {
                i11++;
            }
        }
        littleEndianWriter.u16(i11 + 1);
        Iterator<Attr> it3 = element.getAttrs().iterator();
        int i12 = 0;
        while (true) {
            if (!it3.hasNext()) {
                i12 = -1;
                break;
            }
            Attr next2 = it3.next();
            if (next2.getNamespace() == null && r.a(next2.getName(), "class")) {
                break;
            } else {
                i12++;
            }
        }
        littleEndianWriter.u16(i12 + 1);
        Iterator<Attr> it4 = element.getAttrs().iterator();
        while (true) {
            if (!it4.hasNext()) {
                i10 = -1;
                break;
            }
            Attr next3 = it4.next();
            if (next3.getNamespace() == null && r.a(next3.getName(), "style")) {
                break;
            } else {
                i10++;
            }
        }
        littleEndianWriter.u16(i10 + 1);
        for (Attr attr : element.getAttrs()) {
            littleEndianWriter.u32(stringTable.of(attr.getNamespace()));
            littleEndianWriter.u32(stringTable.attributeName(attr));
            Value value = attr.getValue();
            if (value instanceof Value.Text) {
                int iOf = stringTable.of(((Value.Text) value).getText());
                littleEndianWriter.u32(iOf);
                INSTANCE.writeValue(littleEndianWriter, 3, iOf);
            } else {
                if (!(value instanceof Value.Typed)) {
                    throw new pg.l();
                }
                littleEndianWriter.u32(-1);
                Value.Typed typed = (Value.Typed) value;
                INSTANCE.writeValue(littleEndianWriter, typed.getType(), typed.getData());
            }
        }
        Iterator<T> it5 = element.getChildren().iterator();
        while (it5.hasNext()) {
            INSTANCE.writeElement(littleEndianWriter, (Element) it5.next(), stringTable);
        }
        writeNodeHeader(littleEndianWriter, 259, 24, element.getLine());
        littleEndianWriter.u32(stringTable.of(element.getNamespace()));
        littleEndianWriter.u32(stringTable.of(element.getName()));
        List<Namespace> namespaces = element.getNamespaces();
        r.e(namespaces, "<this>");
        Iterator it6 = new l0(namespaces).iterator();
        while (true) {
            ListIterator<T> listIterator = ((l0.a) it6).f22731a;
            if (!listIterator.hasPrevious()) {
                return;
            }
            INSTANCE.writeNamespace(littleEndianWriter, BinaryXmlFormat.RES_XML_END_NAMESPACE_TYPE, (Namespace) listIterator.previous(), element.getLine(), stringTable);
        }
    }

    private final void writeNamespace(LittleEndianWriter littleEndianWriter, int i10, Namespace namespace, int i11, StringTable stringTable) {
        writeNodeHeader(littleEndianWriter, i10, 24, i11);
        littleEndianWriter.u32(stringTable.of(namespace.getPrefix()));
        littleEndianWriter.u32(stringTable.of(namespace.getUri()));
    }

    private final void writeNodeHeader(LittleEndianWriter littleEndianWriter, int i10, int i11, int i12) {
        littleEndianWriter.u16(i10);
        littleEndianWriter.u16(16);
        littleEndianWriter.u32(i11);
        littleEndianWriter.u32(i12);
        littleEndianWriter.u32(-1);
    }

    private final void writeValue(LittleEndianWriter littleEndianWriter, int i10, int i11) {
        littleEndianWriter.u16(8);
        littleEndianWriter.u8(0);
        littleEndianWriter.u8(i10);
        littleEndianWriter.u32(i11);
    }

    public final byte[] encode(String xml) throws SAXException, IOException {
        r.e(xml, "xml");
        Element element = parse(xml);
        StringTable stringTable = new StringTable(element);
        LittleEndianWriter littleEndianWriter = new LittleEndianWriter();
        writeElement(littleEndianWriter, element, stringTable);
        byte[] bArrPoolChunk = stringTable.poolChunk();
        byte[] bArrResourceMapChunk = stringTable.resourceMapChunk();
        LittleEndianWriter littleEndianWriter2 = new LittleEndianWriter();
        littleEndianWriter2.u16(3);
        littleEndianWriter2.u16(8);
        littleEndianWriter2.u32(littleEndianWriter.getSize() + bArrPoolChunk.length + 8 + bArrResourceMapChunk.length);
        littleEndianWriter2.bytes(bArrPoolChunk);
        littleEndianWriter2.bytes(bArrResourceMapChunk);
        littleEndianWriter2.bytes(littleEndianWriter.toByteArray());
        return littleEndianWriter2.toByteArray();
    }
}
