package com.codex;

import java.util.*;

public class Solution {
    public static int[] findEvenNumbers(int[] digits) {
        /** You are given an integer array digits, where each element is a digit. The array may contain duplicates.
         * You need to find all the unique integers that follow the given requirements:
         * The integer consists of the concatenation of three elements from digits in any arbitrary order.
         * The integer does not have leading zeros.
         * The integer is even.
         * For example, if the given digits were [1, 2, 3], integers 132 and 312 follow the requirements.
         * Return a sorted array of the unique integers.
         */

        /**
         * Example 1:
         * Input: digits = [2,2,2,2]
         * Output: [22]
         * Explanation: All the three-digit numbers that are even are 22.
         *
         * Example 2:
         * Input: digits = [1,2,3,4,5,6,7,8,9,0]
         * Output: [123,124,125,126,127,128,129,130,132,134,135,136,137,138,139,140,142,143,145,146,147,148,149,150,
         *          152,153,154,156,157,158,159,160,162,164,165,166,167,168,169,170,172,174,175,176,178,179,180,182,
         *          183,185,186,187,189,190,192,193,195,196,198,201,203,205,206,207,208,210,213,215,216,217,218,219,
         *          230,231,234,235,236,237,238,240,241,243,245,246,247,248,249,250,251,252,253,254,256,257,258,259,
         *          260,261,263,265,267,268,269,270,271,273,274,275,276,278,279,280,281,283,285,286,287,289,290,291,
         *          293,294,295,296,298,301,302,304,305,306,307,308,309,320,321,324,325,326,327,328,329,340,341,342,
         *          345,346,347,348,349,350,351,352,354,356,357,358,359,360,361,362,364,365,367,368,369,370,371,372,
         *          374,375,376,378,379,380,382,384,385,386,387,389,390,391,392,394,395,396,398,401,402,403,405,406,
         *          407,408,409,420,421,423,425,426,427,428,429,430,431,432,435,436,437,438,439,450,451,452,453,456,
         *          457,458,459,460,461,462,463,465,467,468,469,470,471,472,473,475,476,478,479,480,482,483,485,486,
         *          487,489,490,491,492,493,495,496,498,501,502,503,504,506,507,508,509,520,521,523,524,527,528,529,
         *          530,531,532,534,536,537,538,539,540,541,542,543,546,547,548,549,560,561,564,565,567,568,569,570,
         *          571,572,573,574,576,578,579,580,581,582,583,584,586,587,589,590,591,592,593,594,596,597,598,601,
         *          602,603,604,605,607,608,609,620,621,623,624,625,627,628,629,630,631,632,634,635,637,638,639,640,
         *          641,642,643,645,647,648,649,650,651,652,653,654,657,658,659,670,671,672,674,675,678,679,680,681,
         *          682,683,684,685,687,689,690,691,692,693,694,695,697,698,701,702,703,704,705,706,708,709,720,721,
         *          723,724,725,726,728,729,730,731,732,734,735,736,738,739,740,741,742,743,745,746,748,749,750,751,
         *          752,753,}