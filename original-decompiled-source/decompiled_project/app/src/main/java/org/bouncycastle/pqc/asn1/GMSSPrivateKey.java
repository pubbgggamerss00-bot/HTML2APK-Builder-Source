package org.bouncycastle.pqc.asn1;

import ad.f;
import java.util.Vector;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.pqc.legacy.crypto.gmss.GMSSLeaf;
import org.bouncycastle.pqc.legacy.crypto.gmss.GMSSParameters;
import org.bouncycastle.pqc.legacy.crypto.gmss.GMSSRootCalc;
import org.bouncycastle.pqc.legacy.crypto.gmss.GMSSRootSig;
import org.bouncycastle.pqc.legacy.crypto.gmss.Treehash;

/* loaded from: classes3.dex */
public class GMSSPrivateKey extends ASN1Object {
    private ASN1Primitive primitive;

    private GMSSPrivateKey(ASN1Sequence aSN1Sequence) {
        ASN1Sequence aSN1Sequence2 = (ASN1Sequence) aSN1Sequence.getObjectAt(0);
        int[] iArr = new int[aSN1Sequence2.size()];
        for (int i10 = 0; i10 < aSN1Sequence2.size(); i10++) {
            iArr[i10] = checkBigIntegerInIntRange(aSN1Sequence2.getObjectAt(i10));
        }
        ASN1Sequence aSN1Sequence3 = (ASN1Sequence) aSN1Sequence.getObjectAt(1);
        int size = aSN1Sequence3.size();
        byte[][] bArr = new byte[size][];
        for (int i11 = 0; i11 < size; i11++) {
            bArr[i11] = ((DEROctetString) aSN1Sequence3.getObjectAt(i11)).getOctets();
        }
        ASN1Sequence aSN1Sequence4 = (ASN1Sequence) aSN1Sequence.getObjectAt(2);
        int size2 = aSN1Sequence4.size();
        byte[][] bArr2 = new byte[size2][];
        for (int i12 = 0; i12 < size2; i12++) {
            bArr2[i12] = ((DEROctetString) aSN1Sequence4.getObjectAt(i12)).getOctets();
        }
        ASN1Sequence aSN1Sequence5 = (ASN1Sequence) aSN1Sequence.getObjectAt(3);
        int size3 = aSN1Sequence5.size();
        byte[][][] bArr3 = new byte[size3][][];
        for (int i13 = 0; i13 < size3; i13++) {
            ASN1Sequence aSN1Sequence6 = (ASN1Sequence) aSN1Sequence5.getObjectAt(i13);
            bArr3[i13] = new byte[aSN1Sequence6.size()][];
            int i14 = 0;
            while (true) {
                byte[][] bArr4 = bArr3[i13];
                if (i14 < bArr4.length) {
                    bArr4[i14] = ((DEROctetString) aSN1Sequence6.getObjectAt(i14)).getOctets();
                    i14++;
                }
            }
        }
        ASN1Sequence aSN1Sequence7 = (ASN1Sequence) aSN1Sequence.getObjectAt(4);
        int size4 = aSN1Sequence7.size();
        byte[][][] bArr5 = new byte[size4][][];
        for (int i15 = 0; i15 < size4; i15++) {
            ASN1Sequence aSN1Sequence8 = (ASN1Sequence) aSN1Sequence7.getObjectAt(i15);
            bArr5[i15] = new byte[aSN1Sequence8.size()][];
            int i16 = 0;
            while (true) {
                byte[][] bArr6 = bArr5[i15];
                if (i16 < bArr6.length) {
                    bArr6[i16] = ((DEROctetString) aSN1Sequence8.getObjectAt(i16)).getOctets();
                    i16++;
                }
            }
        }
        Treehash[][] treehashArr = new Treehash[((ASN1Sequence) aSN1Sequence.getObjectAt(5)).size()][];
    }

    private static int checkBigIntegerInIntRange(ASN1Encodable aSN1Encodable) {
        return ((ASN1Integer) aSN1Encodable).intValueExact();
    }

    private ASN1Primitive encode(int[] iArr, byte[][] bArr, byte[][] bArr2, byte[][][] bArr3, byte[][][] bArr4, byte[][][] bArr5, Treehash[][] treehashArr, Treehash[][] treehashArr2, Vector[] vectorArr, Vector[] vectorArr2, Vector[][] vectorArr3, Vector[][] vectorArr4, GMSSLeaf[] gMSSLeafArr, GMSSLeaf[] gMSSLeafArr2, GMSSLeaf[] gMSSLeafArr3, int[] iArr2, byte[][] bArr6, GMSSRootCalc[] gMSSRootCalcArr, byte[][] bArr7, GMSSRootSig[] gMSSRootSigArr, GMSSParameters gMSSParameters, AlgorithmIdentifier[] algorithmIdentifierArr) {
        int[] iArr3 = iArr;
        Treehash[][] treehashArr3 = treehashArr;
        Treehash[][] treehashArr4 = treehashArr2;
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
        int i10 = 0;
        while (i10 < iArr3.length) {
            aSN1EncodableVector2.add(new ASN1Integer(iArr[i10]));
            i10++;
            iArr3 = iArr;
        }
        ASN1EncodableVector aSN1EncodableVectorB = f.b(aSN1EncodableVector2, aSN1EncodableVector);
        for (byte[] bArr8 : bArr) {
            aSN1EncodableVectorB.add(new DEROctetString(bArr8));
        }
        ASN1EncodableVector aSN1EncodableVectorB2 = f.b(aSN1EncodableVectorB, aSN1EncodableVector);
        for (byte[] bArr9 : bArr2) {
            aSN1EncodableVectorB2.add(new DEROctetString(bArr9));
        }
        ASN1EncodableVector aSN1EncodableVectorB3 = f.b(aSN1EncodableVectorB2, aSN1EncodableVector);
        ASN1EncodableVector aSN1EncodableVector3 = new ASN1EncodableVector();
        for (int i11 = 0; i11 < bArr3.length; i11++) {
            for (int i12 = 0; i12 < bArr3[i11].length; i12++) {
                aSN1EncodableVectorB3.add(new DEROctetString(bArr3[i11][i12]));
            }
            aSN1EncodableVectorB3 = f.b(aSN1EncodableVectorB3, aSN1EncodableVector3);
        }
        ASN1EncodableVector aSN1EncodableVectorB4 = f.b(aSN1EncodableVector3, aSN1EncodableVector);
        ASN1EncodableVector aSN1EncodableVector4 = new ASN1EncodableVector();
        for (int i13 = 0; i13 < bArr4.length; i13++) {
            for (int i14 = 0; i14 < bArr4[i13].length; i14++) {
                aSN1EncodableVectorB4.add(new DEROctetString(bArr4[i13][i14]));
            }
            aSN1EncodableVectorB4 = f.b(aSN1EncodableVectorB4, aSN1EncodableVector4);
        }
        ASN1EncodableVector aSN1EncodableVectorB5 = f.b(aSN1EncodableVector4, aSN1EncodableVector);
        ASN1EncodableVector aSN1EncodableVector5 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector6 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector7 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector8 = new ASN1EncodableVector();
        int i15 = 0;
        while (i15 < treehashArr3.length) {
            int i16 = 0;
            while (i16 < treehashArr3[i15].length) {
                aSN1EncodableVector6.add(new DERSequence(algorithmIdentifierArr[0]));
                int i17 = treehashArr3[i15][i16].getStatInt()[1];
                aSN1EncodableVector7.add(new DEROctetString(treehashArr3[i15][i16].getStatByte()[0]));
                aSN1EncodableVector7.add(new DEROctetString(treehashArr3[i15][i16].getStatByte()[1]));
                aSN1EncodableVector7.add(new DEROctetString(treehashArr3[i15][i16].getStatByte()[2]));
                int i18 = 0;
                while (i18 < i17) {
                    aSN1EncodableVector7.add(new DEROctetString(treehashArr3[i15][i16].getStatByte()[i18 + 3]));
                    i18++;
                    treehashArr3 = treehashArr;
                }
                aSN1EncodableVector7 = f.b(aSN1EncodableVector7, aSN1EncodableVector6);
                aSN1EncodableVector8.add(new ASN1Integer(treehashArr[i15][i16].getStatInt()[0]));
                aSN1EncodableVector8.add(new ASN1Integer(i17));
                aSN1EncodableVector8.add(new ASN1Integer(treehashArr[i15][i16].getStatInt()[2]));
                aSN1EncodableVector8.add(new ASN1Integer(treehashArr[i15][i16].getStatInt()[3]));
                aSN1EncodableVector8.add(new ASN1Integer(treehashArr[i15][i16].getStatInt()[4]));
                aSN1EncodableVector8.add(new ASN1Integer(treehashArr[i15][i16].getStatInt()[5]));
                int i19 = 0;
                while (i19 < i17) {
                    aSN1EncodableVector8.add(new ASN1Integer(treehashArr[i15][i16].getStatInt()[i19 + 6]));
                    i19++;
                    i15 = i15;
                    i16 = i16;
                }
                aSN1EncodableVector8 = f.b(aSN1EncodableVector8, aSN1EncodableVector6);
                aSN1EncodableVector6 = f.b(aSN1EncodableVector6, aSN1EncodableVector5);
                i16++;
                treehashArr3 = treehashArr;
            }
            aSN1EncodableVector5 = f.b(aSN1EncodableVector5, aSN1EncodableVectorB5);
            i15++;
            treehashArr3 = treehashArr;
        }
        ASN1EncodableVector aSN1EncodableVectorB6 = f.b(aSN1EncodableVectorB5, aSN1EncodableVector);
        ASN1EncodableVector aSN1EncodableVector9 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector10 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector11 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector12 = new ASN1EncodableVector();
        int i20 = 0;
        while (i20 < treehashArr4.length) {
            int i21 = 0;
            while (i21 < treehashArr4[i20].length) {
                aSN1EncodableVector10.add(new DERSequence(algorithmIdentifierArr[0]));
                int i22 = treehashArr4[i20][i21].getStatInt()[1];
                aSN1EncodableVector11.add(new DEROctetString(treehashArr4[i20][i21].getStatByte()[0]));
                aSN1EncodableVector11.add(new DEROctetString(treehashArr4[i20][i21].getStatByte()[1]));
                aSN1EncodableVector11.add(new DEROctetString(treehashArr4[i20][i21].getStatByte()[2]));
                for (int i23 = 0; i23 < i22; i23++) {
                    aSN1EncodableVector11.add(new DEROctetString(treehashArr4[i20][i21].getStatByte()[i23 + 3]));
                }
                aSN1EncodableVector11 = f.b(aSN1EncodableVector11, aSN1EncodableVector10);
                aSN1EncodableVector12.add(new ASN1Integer(treehashArr4[i20][i21].getStatInt()[0]));
                aSN1EncodableVector12.add(new ASN1Integer(i22));
                aSN1EncodableVector12.add(new ASN1Integer(treehashArr4[i20][i21].getStatInt()[2]));
                aSN1EncodableVector12.add(new ASN1Integer(treehashArr4[i20][i21].getStatInt()[3]));
                aSN1EncodableVector12.add(new ASN1Integer(treehashArr4[i20][i21].getStatInt()[4]));
                aSN1EncodableVector12.add(new ASN1Integer(treehashArr4[i20][i21].getStatInt()[5]));
                int i24 = 0;
                while (i24 < i22) {
                    aSN1EncodableVector12.add(new ASN1Integer(treehashArr4[i20][i21].getStatInt()[i24 + 6]));
                    i24++;
                    treehashArr4 = treehashArr2;
                    i20 = i20;
                }
                aSN1EncodableVector12 = f.b(aSN1EncodableVector12, aSN1EncodableVector10);
                aSN1EncodableVector10 = f.b(aSN1EncodableVector10, aSN1EncodableVector9);
                i21++;
                treehashArr4 = treehashArr2;
            }
            aSN1EncodableVectorB6.add(new DERSequence(new DERSequence(aSN1EncodableVector9)));
            aSN1EncodableVector9 = new ASN1EncodableVector();
            i20++;
            treehashArr4 = treehashArr2;
        }
        ASN1EncodableVector aSN1EncodableVectorB7 = f.b(aSN1EncodableVectorB6, aSN1EncodableVector);
        ASN1EncodableVector aSN1EncodableVector13 = new ASN1EncodableVector();
        for (int i25 = 0; i25 < bArr5.length; i25++) {
            for (int i26 = 0; i26 < bArr5[i25].length; i26++) {
                aSN1EncodableVectorB7.add(new DEROctetString(bArr5[i25][i26]));
            }
            aSN1EncodableVectorB7 = f.b(aSN1EncodableVectorB7, aSN1EncodableVector13);
        }
        ASN1EncodableVector aSN1EncodableVectorB8 = f.b(aSN1EncodableVector13, aSN1EncodableVector);
        ASN1EncodableVector aSN1EncodableVector14 = new ASN1EncodableVector();
        for (int i27 = 0; i27 < vectorArr.length; i27++) {
            for (int i28 = 0; i28 < vectorArr[i27].size(); i28++) {
                aSN1EncodableVectorB8.add(new DEROctetString((byte[]) vectorArr[i27].elementAt(i28)));
            }
            aSN1EncodableVectorB8 = f.b(aSN1EncodableVectorB8, aSN1EncodableVector14);
        }
        ASN1EncodableVector aSN1EncodableVectorB9 = f.b(aSN1EncodableVector14, aSN1EncodableVector);
        ASN1EncodableVector aSN1EncodableVector15 = new ASN1EncodableVector();
        for (int i29 = 0; i29 < vectorArr2.length; i29++) {
            for (int i30 = 0; i30 < vectorArr2[i29].size(); i30++) {
                aSN1EncodableVectorB9.add(new DEROctetString((byte[]) vectorArr2[i29].elementAt(i30)));
            }
            aSN1EncodableVectorB9 = f.b(aSN1EncodableVectorB9, aSN1EncodableVector15);
        }
        ASN1EncodableVector aSN1EncodableVectorB10 = f.b(aSN1EncodableVector15, aSN1EncodableVector);
        ASN1EncodableVector aSN1EncodableVector16 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector17 = new ASN1EncodableVector();
        for (int i31 = 0; i31 < vectorArr3.length; i31++) {
            for (int i32 = 0; i32 < vectorArr3[i31].length; i32++) {
                for (int i33 = 0; i33 < vectorArr3[i31][i32].size(); i33++) {
                    aSN1EncodableVectorB10.add(new DEROctetString((byte[]) vectorArr3[i31][i32].elementAt(i33)));
                }
                aSN1EncodableVectorB10 = f.b(aSN1EncodableVectorB10, aSN1EncodableVector16);
            }
            aSN1EncodableVector16 = f.b(aSN1EncodableVector16, aSN1EncodableVector17);
        }
        ASN1EncodableVector aSN1EncodableVectorB11 = f.b(aSN1EncodableVector17, aSN1EncodableVector);
        ASN1EncodableVector aSN1EncodableVector18 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector19 = new ASN1EncodableVector();
        for (int i34 = 0; i34 < vectorArr4.length; i34++) {
            for (int i35 = 0; i35 < vectorArr4[i34].length; i35++) {
                for (int i36 = 0; i36 < vectorArr4[i34][i35].size(); i36++) {
                    aSN1EncodableVectorB11.add(new DEROctetString((byte[]) vectorArr4[i34][i35].elementAt(i36)));
                }
                aSN1EncodableVectorB11 = f.b(aSN1EncodableVectorB11, aSN1EncodableVector18);
            }
            aSN1EncodableVector18 = f.b(aSN1EncodableVector18, aSN1EncodableVector19);
        }
        ASN1EncodableVector aSN1EncodableVectorB12 = f.b(aSN1EncodableVector19, aSN1EncodableVector);
        ASN1EncodableVector aSN1EncodableVector20 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector21 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector22 = new ASN1EncodableVector();
        for (int i37 = 0; i37 < gMSSLeafArr.length; i37++) {
            aSN1EncodableVector20.add(new DERSequence(algorithmIdentifierArr[0]));
            byte[][] statByte = gMSSLeafArr[i37].getStatByte();
            aSN1EncodableVector21.add(new DEROctetString(statByte[0]));
            aSN1EncodableVector21.add(new DEROctetString(statByte[1]));
            aSN1EncodableVector21.add(new DEROctetString(statByte[2]));
            aSN1EncodableVector21.add(new DEROctetString(statByte[3]));
            aSN1EncodableVector20.add(new DERSequence(aSN1EncodableVector21));
            aSN1EncodableVector21 = new ASN1EncodableVector();
            int[] statInt = gMSSLeafArr[i37].getStatInt();
            aSN1EncodableVector22.add(new ASN1Integer(statInt[0]));
            aSN1EncodableVector22.add(new ASN1Integer(statInt[1]));
            aSN1EncodableVector22.add(new ASN1Integer(statInt[2]));
            aSN1EncodableVector22.add(new ASN1Integer(statInt[3]));
            aSN1EncodableVector20.add(new DERSequence(aSN1EncodableVector22));
            aSN1EncodableVector22 = new ASN1EncodableVector();
            aSN1EncodableVector20 = f.b(aSN1EncodableVector20, aSN1EncodableVectorB12);
        }
        ASN1EncodableVector aSN1EncodableVectorB13 = f.b(aSN1EncodableVectorB12, aSN1EncodableVector);
        ASN1EncodableVector aSN1EncodableVector23 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector24 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector25 = new ASN1EncodableVector();
        for (int i38 = 0; i38 < gMSSLeafArr2.length; i38++) {
            aSN1EncodableVector23.add(new DERSequence(algorithmIdentifierArr[0]));
            byte[][] statByte2 = gMSSLeafArr2[i38].getStatByte();
            aSN1EncodableVector24.add(new DEROctetString(statByte2[0]));
            aSN1EncodableVector24.add(new DEROctetString(statByte2[1]));
            aSN1EncodableVector24.add(new DEROctetString(statByte2[2]));
            aSN1EncodableVector24.add(new DEROctetString(statByte2[3]));
            aSN1EncodableVector23.add(new DERSequence(aSN1EncodableVector24));
            aSN1EncodableVector24 = new ASN1EncodableVector();
            int[] statInt2 = gMSSLeafArr2[i38].getStatInt();
            aSN1EncodableVector25.add(new ASN1Integer(statInt2[0]));
            aSN1EncodableVector25.add(new ASN1Integer(statInt2[1]));
            aSN1EncodableVector25.add(new ASN1Integer(statInt2[2]));
            aSN1EncodableVector25.add(new ASN1Integer(statInt2[3]));
            aSN1EncodableVector23.add(new DERSequence(aSN1EncodableVector25));
            aSN1EncodableVector25 = new ASN1EncodableVector();
            aSN1EncodableVector23 = f.b(aSN1EncodableVector23, aSN1EncodableVectorB13);
        }
        ASN1EncodableVector aSN1EncodableVectorB14 = f.b(aSN1EncodableVectorB13, aSN1EncodableVector);
        ASN1EncodableVector aSN1EncodableVector26 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector27 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector28 = new ASN1EncodableVector();
        for (int i39 = 0; i39 < gMSSLeafArr3.length; i39++) {
            aSN1EncodableVector26.add(new DERSequence(algorithmIdentifierArr[0]));
            byte[][] statByte3 = gMSSLeafArr3[i39].getStatByte();
            aSN1EncodableVector27.add(new DEROctetString(statByte3[0]));
            aSN1EncodableVector27.add(new DEROctetString(statByte3[1]));
            aSN1EncodableVector27.add(new DEROctetString(statByte3[2]));
            aSN1EncodableVector27.add(new DEROctetString(statByte3[3]));
            aSN1EncodableVector26.add(new DERSequence(aSN1EncodableVector27));
            aSN1EncodableVector27 = new ASN1EncodableVector();
            int[] statInt3 = gMSSLeafArr3[i39].getStatInt();
            aSN1EncodableVector28.add(new ASN1Integer(statInt3[0]));
            aSN1EncodableVector28.add(new ASN1Integer(statInt3[1]));
            aSN1EncodableVector28.add(new ASN1Integer(statInt3[2]));
            aSN1EncodableVector28.add(new ASN1Integer(statInt3[3]));
            aSN1EncodableVector26.add(new DERSequence(aSN1EncodableVector28));
            aSN1EncodableVector28 = new ASN1EncodableVector();
            aSN1EncodableVector26 = f.b(aSN1EncodableVector26, aSN1EncodableVectorB14);
        }
        ASN1EncodableVector aSN1EncodableVectorB15 = f.b(aSN1EncodableVectorB14, aSN1EncodableVector);
        for (int i40 : iArr2) {
            aSN1EncodableVectorB15.add(new ASN1Integer(i40));
        }
        ASN1EncodableVector aSN1EncodableVectorB16 = f.b(aSN1EncodableVectorB15, aSN1EncodableVector);
        for (byte[] bArr10 : bArr6) {
            aSN1EncodableVectorB16.add(new DEROctetString(bArr10));
        }
        ASN1EncodableVector aSN1EncodableVectorB17 = f.b(aSN1EncodableVectorB16, aSN1EncodableVector);
        ASN1EncodableVector aSN1EncodableVector29 = new ASN1EncodableVector();
        new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector30 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector31 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector32 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector33 = new ASN1EncodableVector();
        int i41 = 0;
        while (i41 < gMSSRootCalcArr.length) {
            aSN1EncodableVector29.add(new DERSequence(algorithmIdentifierArr[0]));
            new ASN1EncodableVector();
            int i42 = gMSSRootCalcArr[i41].getStatInt()[0];
            int i43 = gMSSRootCalcArr[i41].getStatInt()[7];
            aSN1EncodableVector30.add(new DEROctetString(gMSSRootCalcArr[i41].getStatByte()[0]));
            int i44 = 0;
            while (i44 < i42) {
                i44++;
                aSN1EncodableVector30.add(new DEROctetString(gMSSRootCalcArr[i41].getStatByte()[i44]));
            }
            for (int i45 = 0; i45 < i43; i45++) {
                aSN1EncodableVector30.add(new DEROctetString(gMSSRootCalcArr[i41].getStatByte()[i42 + 1 + i45]));
            }
            ASN1EncodableVector aSN1EncodableVectorB18 = f.b(aSN1EncodableVector30, aSN1EncodableVector29);
            aSN1EncodableVector31.add(new ASN1Integer(i42));
            aSN1EncodableVector31.add(new ASN1Integer(gMSSRootCalcArr[i41].getStatInt()[1]));
            aSN1EncodableVector31.add(new ASN1Integer(gMSSRootCalcArr[i41].getStatInt()[2]));
            aSN1EncodableVector31.add(new ASN1Integer(gMSSRootCalcArr[i41].getStatInt()[3]));
            aSN1EncodableVector31.add(new ASN1Integer(gMSSRootCalcArr[i41].getStatInt()[4]));
            aSN1EncodableVector31.add(new ASN1Integer(gMSSRootCalcArr[i41].getStatInt()[5]));
            aSN1EncodableVector31.add(new ASN1Integer(gMSSRootCalcArr[i41].getStatInt()[6]));
            aSN1EncodableVector31.add(new ASN1Integer(i43));
            for (int i46 = 0; i46 < i42; i46++) {
                aSN1EncodableVector31.add(new ASN1Integer(gMSSRootCalcArr[i41].getStatInt()[i46 + 8]));
            }
            for (int i47 = 0; i47 < i43; i47++) {
                aSN1EncodableVector31.add(new ASN1Integer(gMSSRootCalcArr[i41].getStatInt()[i42 + 8 + i47]));
            }
            ASN1EncodableVector aSN1EncodableVectorB19 = f.b(aSN1EncodableVector31, aSN1EncodableVector29);
            ASN1EncodableVector aSN1EncodableVector34 = new ASN1EncodableVector();
            ASN1EncodableVector aSN1EncodableVector35 = new ASN1EncodableVector();
            ASN1EncodableVector aSN1EncodableVector36 = new ASN1EncodableVector();
            if (gMSSRootCalcArr[i41].getTreehash() != null) {
                int i48 = 0;
                while (i48 < gMSSRootCalcArr[i41].getTreehash().length) {
                    aSN1EncodableVector34.add(new DERSequence(algorithmIdentifierArr[0]));
                    int i49 = gMSSRootCalcArr[i41].getTreehash()[i48].getStatInt()[1];
                    aSN1EncodableVector35.add(new DEROctetString(gMSSRootCalcArr[i41].getTreehash()[i48].getStatByte()[0]));
                    aSN1EncodableVector35.add(new DEROctetString(gMSSRootCalcArr[i41].getTreehash()[i48].getStatByte()[1]));
                    aSN1EncodableVector35.add(new DEROctetString(gMSSRootCalcArr[i41].getTreehash()[i48].getStatByte()[2]));
                    int i50 = 0;
                    while (i50 < i49) {
                        aSN1EncodableVector35.add(new DEROctetString(gMSSRootCalcArr[i41].getTreehash()[i48].getStatByte()[i50 + 3]));
                        i50++;
                        aSN1EncodableVectorB18 = aSN1EncodableVectorB18;
                    }
                    ASN1EncodableVector aSN1EncodableVector37 = aSN1EncodableVectorB18;
                    aSN1EncodableVector35 = f.b(aSN1EncodableVector35, aSN1EncodableVector34);
                    aSN1EncodableVector36.add(new ASN1Integer(gMSSRootCalcArr[i41].getTreehash()[i48].getStatInt()[0]));
                    aSN1EncodableVector36.add(new ASN1Integer(i49));
                    aSN1EncodableVector36.add(new ASN1Integer(gMSSRootCalcArr[i41].getTreehash()[i48].getStatInt()[2]));
                    aSN1EncodableVector36.add(new ASN1Integer(gMSSRootCalcArr[i41].getTreehash()[i48].getStatInt()[3]));
                    aSN1EncodableVector36.add(new ASN1Integer(gMSSRootCalcArr[i41].getTreehash()[i48].getStatInt()[4]));
                    aSN1EncodableVector36.add(new ASN1Integer(gMSSRootCalcArr[i41].getTreehash()[i48].getStatInt()[5]));
                    int i51 = 0;
                    while (i51 < i49) {
                        aSN1EncodableVector36.add(new ASN1Integer(gMSSRootCalcArr[i41].getTreehash()[i48].getStatInt()[i51 + 6]));
                        i51++;
                        aSN1EncodableVectorB19 = aSN1EncodableVectorB19;
                    }
                    aSN1EncodableVector36 = f.b(aSN1EncodableVector36, aSN1EncodableVector34);
                    aSN1EncodableVector34 = f.b(aSN1EncodableVector34, aSN1EncodableVector32);
                    i48++;
                    aSN1EncodableVectorB18 = aSN1EncodableVector37;
                }
            }
            ASN1EncodableVector aSN1EncodableVector38 = aSN1EncodableVectorB18;
            ASN1EncodableVector aSN1EncodableVector39 = aSN1EncodableVectorB19;
            aSN1EncodableVector32 = f.b(aSN1EncodableVector32, aSN1EncodableVector29);
            ASN1EncodableVector aSN1EncodableVector40 = new ASN1EncodableVector();
            if (gMSSRootCalcArr[i41].getRetain() != null) {
                for (int i52 = 0; i52 < gMSSRootCalcArr[i41].getRetain().length; i52++) {
                    for (int i53 = 0; i53 < gMSSRootCalcArr[i41].getRetain()[i52].size(); i53++) {
                        aSN1EncodableVector40.add(new DEROctetString((byte[]) gMSSRootCalcArr[i41].getRetain()[i52].elementAt(i53)));
                    }
                    aSN1EncodableVector40 = f.b(aSN1EncodableVector40, aSN1EncodableVector33);
                }
            }
            aSN1EncodableVector33 = f.b(aSN1EncodableVector33, aSN1EncodableVector29);
            aSN1EncodableVector29 = f.b(aSN1EncodableVector29, aSN1EncodableVectorB17);
            i41++;
            aSN1EncodableVector30 = aSN1EncodableVector38;
            aSN1EncodableVector31 = aSN1EncodableVector39;
        }
        ASN1EncodableVector aSN1EncodableVectorB20 = f.b(aSN1EncodableVectorB17, aSN1EncodableVector);
        for (byte[] bArr11 : bArr7) {
            aSN1EncodableVectorB20.add(new DEROctetString(bArr11));
        }
        ASN1EncodableVector aSN1EncodableVectorB21 = f.b(aSN1EncodableVectorB20, aSN1EncodableVector);
        ASN1EncodableVector aSN1EncodableVector41 = new ASN1EncodableVector();
        new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector42 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector43 = new ASN1EncodableVector();
        for (int i54 = 0; i54 < gMSSRootSigArr.length; i54++) {
            aSN1EncodableVector41.add(new DERSequence(algorithmIdentifierArr[0]));
            new ASN1EncodableVector();
            aSN1EncodableVector42.add(new DEROctetString(gMSSRootSigArr[i54].getStatByte()[0]));
            aSN1EncodableVector42.add(new DEROctetString(gMSSRootSigArr[i54].getStatByte()[1]));
            aSN1EncodableVector42.add(new DEROctetString(gMSSRootSigArr[i54].getStatByte()[2]));
            aSN1EncodableVector42.add(new DEROctetString(gMSSRootSigArr[i54].getStatByte()[3]));
            aSN1EncodableVector42.add(new DEROctetString(gMSSRootSigArr[i54].getStatByte()[4]));
            aSN1EncodableVector41.add(new DERSequence(aSN1EncodableVector42));
            aSN1EncodableVector42 = new ASN1EncodableVector();
            aSN1EncodableVector43.add(new ASN1Integer(gMSSRootSigArr[i54].getStatInt()[0]));
            aSN1EncodableVector43.add(new ASN1Integer(gMSSRootSigArr[i54].getStatInt()[1]));
            aSN1EncodableVector43.add(new ASN1Integer(gMSSRootSigArr[i54].getStatInt()[2]));
            aSN1EncodableVector43.add(new ASN1Integer(gMSSRootSigArr[i54].getStatInt()[3]));
            aSN1EncodableVector43.add(new ASN1Integer(gMSSRootSigArr[i54].getStatInt()[4]));
            aSN1EncodableVector43.add(new ASN1Integer(gMSSRootSigArr[i54].getStatInt()[5]));
            aSN1EncodableVector43.add(new ASN1Integer(gMSSRootSigArr[i54].getStatInt()[6]));
            aSN1EncodableVector43.add(new ASN1Integer(gMSSRootSigArr[i54].getStatInt()[7]));
            aSN1EncodableVector43.add(new ASN1Integer(gMSSRootSigArr[i54].getStatInt()[8]));
            aSN1EncodableVector41.add(new DERSequence(aSN1EncodableVector43));
            aSN1EncodableVector43 = new ASN1EncodableVector();
            aSN1EncodableVector41 = f.b(aSN1EncodableVector41, aSN1EncodableVectorB21);
        }
        ASN1EncodableVector aSN1EncodableVectorB22 = f.b(aSN1EncodableVectorB21, aSN1EncodableVector);
        ASN1EncodableVector aSN1EncodableVector44 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector45 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector46 = new ASN1EncodableVector();
        for (int i55 = 0; i55 < gMSSParameters.getHeightOfTrees().length; i55++) {
            aSN1EncodableVector44.add(new ASN1Integer(gMSSParameters.getHeightOfTrees()[i55]));
            aSN1EncodableVector45.add(new ASN1Integer(gMSSParameters.getWinternitzParameter()[i55]));
            aSN1EncodableVector46.add(new ASN1Integer(gMSSParameters.getK()[i55]));
        }
        aSN1EncodableVectorB22.add(new ASN1Integer(gMSSParameters.getNumOfLayers()));
        aSN1EncodableVectorB22.add(new DERSequence(aSN1EncodableVector44));
        aSN1EncodableVectorB22.add(new DERSequence(aSN1EncodableVector45));
        aSN1EncodableVectorB22.add(new DERSequence(aSN1EncodableVector46));
        ASN1EncodableVector aSN1EncodableVectorB23 = f.b(aSN1EncodableVectorB22, aSN1EncodableVector);
        for (AlgorithmIdentifier algorithmIdentifier : algorithmIdentifierArr) {
            aSN1EncodableVectorB23.add(algorithmIdentifier);
        }
        aSN1EncodableVector.add(new DERSequence(aSN1EncodableVectorB23));
        return new DERSequence(aSN1EncodableVector);
    }

    public static GMSSPrivateKey getInstance(Object obj) {
        if (obj instanceof GMSSPrivateKey) {
            return (GMSSPrivateKey) obj;
        }
        if (obj != null) {
            return new GMSSPrivateKey(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.primitive;
    }

    public GMSSPrivateKey(int[] iArr, byte[][] bArr, byte[][] bArr2, byte[][][] bArr3, byte[][][] bArr4, Treehash[][] treehashArr, Treehash[][] treehashArr2, Vector[] vectorArr, Vector[] vectorArr2, Vector[][] vectorArr3, Vector[][] vectorArr4, byte[][][] bArr5, GMSSLeaf[] gMSSLeafArr, GMSSLeaf[] gMSSLeafArr2, GMSSLeaf[] gMSSLeafArr3, int[] iArr2, byte[][] bArr6, GMSSRootCalc[] gMSSRootCalcArr, byte[][] bArr7, GMSSRootSig[] gMSSRootSigArr, GMSSParameters gMSSParameters, AlgorithmIdentifier algorithmIdentifier) {
        this.primitive = encode(iArr, bArr, bArr2, bArr3, bArr4, bArr5, treehashArr, treehashArr2, vectorArr, vectorArr2, vectorArr3, vectorArr4, gMSSLeafArr, gMSSLeafArr2, gMSSLeafArr3, iArr2, bArr6, gMSSRootCalcArr, bArr7, gMSSRootSigArr, gMSSParameters, new AlgorithmIdentifier[]{algorithmIdentifier});
    }
}
