package in.tbuddy.tbuddy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class stud_profile_info_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stud_profile_info_2);
        final Spinner spinner = (Spinner) findViewById(R.id.spinner2);
        final Spinner college = findViewById(R.id.spinner1);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String text = spinner.getSelectedItem().toString();
                if (text.equals("APJ Abdul Kalam Technological University")) {
                    String[] array = {"Select College", "Adi Shankara Institute Of Engineering And Tech ( ASI )",
                            "Al Azhar College Of Engineering And Technology ( Aae )",
                            "Al-Ameen Engineering College ( Aap )",
                            "Albertian Institute Of Science And Technology, Kalamassery, Kochi ( Aik )",
                            "Amal Jyothi College Of Engineering ( Ajc )",
                            "Ammini College Of Engineering ( Ame )",
                            "Archana College Of Engineering ( Ace )",
                            "Awh Engineering College, Kozhikkode ( Awh )",
                            "Axis College Of Engineering And Technology ( Axe )",
                            "Baselios Mathews Ii College Of Engg., Sasthamcotta, Kollam ( Bmc )",
                            "Baselios Thomas I Catholicose College Of Engineering And Technology ( Bte )",
                            "Bishop Jerome Institute, Fathima College Road, Kollam ( Bjk )",
                            "Caarmel Engineering College ( Cml )",
                            "Christ Knowledge City ( Ckc )",
                            "Co-operative Institute Of Technology Vadakara ( Vda )",
                            "Cochin College Of Engineering And Technology, Valanchery, Malappuram ( Ccv )",
                            "Cochin Institute Of Science & Technology, Muvattupuzha, Ernakulam ( Cim )",
                            "College Of Dairy Science And Technology ( Cdt )",
                            "College Of Engineering And Management Punnnapra ( Prp )",
                            "College Of Engineering And Technology-payyannur ( Cen )",
                            "College Of Engineering Perumon, Kollam ( Prn )",
                            "College Of Engineering Trivandrum ( Tve )",
                            "College Of Engineering, Adoor ( Adr )",
                            "College Of Engineering, Attingal, Thiruvananthapuram. ( Cea )",
                            "College Of Engineering, Chengannur, Alappuzha. ( Chn )",
                            "College Of Engineering, Cherthala, Pallippuram, Alappuzha. ( Cec )",
                            "College Of Engineering, Kallooppara, Pathanamthitta. ( Pta )",
                            "College Of Engineering, Karunagappally, Kollam. ( Knp )",
                            "College Of Engineering, Kidangoor ( Kgr )",
                            "College Of Engineering, Kottarakkara, Kollam. ( Cek )",
                            "College Of Engineering, Munnar ( Mnr )",
                            "College Of Engineering, Pathanapuram, Kollam ( Pec )",
                            "College Of Engineering, Poonjar, Kottayam. ( Pjr )",
                            "College Of Engineering, Thalassery, Kannur. ( Tly )",
                            "College Of Engineering, Trikaripur, Kasaragod. ( Tkr )",
                            "Federal Institute Of Science And Technology ( Fit )",
                            "Govt. College Of Engineering, Kannur ( Knr )",
                            "Govt. Engineering College Barton Hill, Tvm ( Trv )",
                            "Govt. Engineering College, Kozhikkode ( Kke )",
                            "Govt. Engineering College, Painavu, Idukki ( Idk )",
                            "Govt. Engineering College, Sreekrishnapuram, Palakkad ( Pkd )",
                            "Govt. Engineering College, Wayanad ( Wyd )",
                            "Govt. Engineering College,thrissur ( Tcr )",
                            "Govt. Rajiv Gandhi Institute Of Tech., Kottayam ( Kte )",
                            "Gurudeva Institute Of Science And Technology ( Git )",
                            "Heera College Of Engineering And Technology ( Hce )",
                            "Hindustan College Of Engineering, Arippa, Chozhiyakode P.o., Kulathupuzha ( Hke )",
                            "Holy Grace Academy Of Engineering For Women, Mala, Kuruvilasseri P O, Thrissur. ( Hgw )",
                            "Holy Kings College Of Engineering And Technology ( Hkc )",
                            "I E S College Of Engineering, Chittilappilly, Thrissur. ( Ies )",
                            "Ilahia College Of Engineering Tech., Mulavoor, Moovattupuzha, Ernakulam. ( Ice )",
                            "Ilahia School Of Science And Technology, Pezhakkapilly.p.o,muvattupuzha ( Ict )",
                            "Indira Gandhi Institute Of Engineering And Technology For Women ( Igw )",
                            "Institute Of Engineering And Technology, Calicut University ( Ucc )",
                            "Jai Bharath College Of Management And Engineering Technology ( Jbt )",
                            "Jawaharlal College Of Engineering And Technology ( Jce )",
                            "John Cox Memorial C S I Institute Of Technology ( Jit )",
                            "Jyothi Engineering College, Cheruthuruthy, Thrissur ( Jec )",
                            "K M E A Engineering College, Edathala, Alwaye. ( Kme )",
                            "K R Gouri Amma College Of Engineering For Women ( Gwe )",
                            "Kelappaji College Of Agricultural Engineering And Technology, Tavanur ( Kct )",
                            "Kmct College Of Engineering For Women ( Kmw )",
                            "Kmct College Of Engineering, Mukkom, Manassery, K ( Kmc )",
                            "Kmp College Of Engineering, Cherukunnam, Asamannoor Po, Perumbavoor ( Kmp )",
                            "Kottayam Institute Of Science And Technology ( Kit )",
                            "Lbs College Of Engineering, Kasaragod ( Ksd )",
                            "Lbs Institute Of Tech. For Women, Poojapura, Tvm ( Lbt )",
                            "Lourdes Matha College Of Science And Technolgy ( Lmc )",
                            "M A College Of Engineering, Kothamangalam ( Mac )",
                            "M E A Engineering College, Perinthalmanna, Vengoor ( Mea )",
                            "M E S College Of Engineering, Kuttippuram. ( Mes )",
                            "M G College Of Engineering, Thiruvallm, Thiruvananthapuram. ( Mgc )",
                            "Malabar College Of Engineering And Technology ( Mec )",
                            "Malabar Institute Of Technology, Anjarakandi, Kannur. ( Mlt )",
                            "Mangalam College Of Engineering, Ettumanoor, Kottayam ( Mlm )",
                            "Mar Baselios Christian College Of Engg And Tech ( Mbc )",
                            "Mar Baselios College Of Engineering And Technology ( Mbt )",
                            "Mar Baselios Institute Of Technology And Science ( Mbi )",
                            "Marian Engineering College, Kazhakuttom, Tvm ( Mce )",
                            "Mary Matha College Of Engineering And Technology Renamed As Prs College Of Engineering And Technology ( Mmo )",
                            "Matha College Of Technology, Manakappadi, North Pravur, Ernakulam ( Mta )",
                            "Mes College Of Engineering And Technology, Kunnukara, Ernakulam. ( Mee )",
                            "Mes Institute Of Technology And Management ( Mek )",
                            "Mets School Of Engineering, Mala ( Met )",
                            "Model Engineering College, Thrikkakkara, Ernakulam ( Mdl )",
                            "Mohandas College Of Engineering And Technology ( Mct )",
                            "Mount Zion College Of Engg., Pathanamthitta ( Mzc )",
                            "Mount Zion College Of Engineering For Women ( Mzw )",
                            "Musaliar College Of Engineering And Technology ( Mck )",
                            "Musaliar College Of Engineering, Chirayinkil, Trivandrum. ( Mcc )",
                            "Muslim Association College Of Engineering, Venjaramoodu, Thiruvananthapuram. ( Mus )",
                            "N S S College Of Engineering, Palakkad ( Nss )",
                            "Nehru College Of Engineering And Research Centre ( Nce )",
                            "Nirmala College Of Engineering, Kunnappilly Po, Meloor, Chalakudy, Thirissur ( Nie )",
                            "P.a.aziz College Of Engineering And Technolgy ( Paa )",
                            "Palakkad Institute Of Science And Technology ( Pit )",
                            "Pankajakasturi College Of Engineering And Technology ( Pke )",
                            "Prime College Of Engineering ( Pce )",
                            "Rajadhani Institute Of Engineering And Technology ( Rie )",
                            "Rajagiri School Of Engineering And Technology ( Ret )",
                            "Royal College Of Engineering And Technology ( Rce )",
                            "S C T College Of Engineering, Pappanamcode, Tvm ( Sct )",
                            "Sadguru Swami Nithyananda Insititute Of Technology ( Sgt )",
                            "Sahrdaya College Of Engineering And Technology ( Shr )",
                            "Saintgits College Of Engineering, Pathamuttom, Kottayam ( Mgp )",
                            "Sarabhai Institute Of Science And Technology ( Sit )",
                            "Scms School Of Engineering And Technology ( Scm )",
                            "Shahul Hameed Memorial Engineering College, Kadakkal, Kollam ( Shm )",
                            "Snm Institute Of Management And Technology ( Snm )",
                            "(SBW) Sree Buddha College Of Engineering For Women, Ayathil, Elavumthitta, Pathanamthitta ",
                            "(SBC) Sree Buddha College Of Engineering, Pattoor, Pattoor. P O, Padanilam, Nooranad, Alappuzha. ",
                            "Sree Ernakulathappan College Of Engineering And Management ( Ece )",
                            "Sree Narayana Guru College Of Engineering And Tech ( Snc )",
                            "Sree Narayana Guru Institute Of Science And Technology ( Snt )",
                            "Sree Narayana Gurukulam College Of Engineering, Kolencherry, Kadayiruppu P O, Ernakulam. ( Sng )",
                            "Sree Narayana Institute Of Technology Adoor ( Snp )",
                            "Sreepathy Institute Of Management And Technology ( Spt )",
                            "Sri Vellappally Natesan College Of Engineering ( Vpe )",
                            "St Josephs College Of Engineering And Technology Palai ( Sjc )",
                            "St Thomas Colllege Of Engineering And Technology ( Stc )",
                            "St. Thomas Institute For Science And Technology ( Sti )",
                            "T K M College Of Engineering, Kollam ( Tkm )",
                            "T K M Institute Of Technology, Ezhukone, Kollam ( Tki )",
                            "Thejus Engineering College ( Tje )",
                            "Toc H Institute Of Science And Technology ( Toc )",
                            "Travancore Engineering College, Oyoor, Kollam ( Tec )",
                            "Trinity College Of Engineering, Trivandrum ( Tct )",
                            "Ukf College Of Engineering And Technology ( Ukp )",
                            "Universal Engineering College, Konathukunnu, Kodungallur, Thrissur. ( Unt )",
                            "(UCK) University College Of Engineering, Kariavattom, Tvm ",
                            "(UCE) University College Of Engineering,thodupuzha ",
                            "Valia Koonambaikulathamma College Of Engg And Tech ( Vke )",
                            "Veda Vyasa Institute Of Technology, Ponnempadam P O, Karadparamba, Malappuram. ( Vvt )",
                            "Vidya Academy Of Science And Technology ( Vas )",
                            "Vijnan Institute Of Science And Technology, Ernakulam. ( Vit )",
                            "Vimal Jyothi Engineering College, Chemperi, Kannur ( Vml )",
                            "Viswajyothi College Of Engineering And Technology ( Vjc )",
                            "(YCE) Younus College Of Engineering And Technology ",
                            "(YCW) Younus College Of Engineering For Women, Thalachira P O, Kottarakkara, Kollam. ",
                            "Younus Institute Of Technology, Kannanaloor ( Yck )"};
                    ArrayAdapter<String> spinnerArrayAdapter = new ArrayAdapter<String>(stud_profile_info_2.this, android.R.layout.simple_spinner_item, array);
                    spinnerArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item); // The drop down view
                    college.setAdapter(spinnerArrayAdapter);


                } else if (text.equals("Amrita Vishwa Vidyapeetham")) {
                    String[] array = {"Select College", "Amrita SOE, Amritapuri", "Amrita SOE, Bangalore", "Amrita SOE, Coimbatore"};
                    ArrayAdapter<String> spinnerArrayAdapter = new ArrayAdapter<String>(stud_profile_info_2.this, android.R.layout.simple_spinner_item, array);
                    spinnerArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item); // The drop down view
                    college.setAdapter(spinnerArrayAdapter);
                } else if (text.equals("Birla Institute of Technology and Science")) {
                    String[] array = {"Select College", "BITS Goa", "BITS Hyderabad", "BITS Pilani"};
                    ArrayAdapter<String> spinnerArrayAdapter = new ArrayAdapter<String>(stud_profile_info_2.this, android.R.layout.simple_spinner_item, array);
                    spinnerArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item); // The drop down view
                    college.setAdapter(spinnerArrayAdapter);
                } else if (text.equals("Cochin University of Science and Technology")) {
                    String[] array = {"Select College", "Kuttanad Campus", "School Of Engineering,CUSAT"};
                    ArrayAdapter<String> spinnerArrayAdapter = new ArrayAdapter<String>(stud_profile_info_2.this, android.R.layout.simple_spinner_item, array);
                    spinnerArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item); // The drop down view
                    college.setAdapter(spinnerArrayAdapter);
                } else if (text.equals("Indian Institute of Technology")) {
                    String[] array = {"Select College", "IIT Bhilai",
                            "IIT Bhubaneswar",
                            "IIT Bombay",
                            "IIT Delhi",
                            "IIT Dhanbad(ISM)",
                            "IIT Dharwad",
                            "IIT Gandhinagar",
                            "IIT Goa",
                            "IIT Guwahati",
                            "IIT Hyderabad",
                            "IIT Indore",
                            "IIT Jammu",
                            "IIT Jodhpur",
                            "IIT Kanpur",
                            "IIT Kharagpur",
                            "IIT Madras",
                            "IIT Mandi",
                            "IIT Palakkad",
                            "IIT Patna",
                            "IIT Roorkee",
                            "IIT Ropar",
                            "IIT Tirupati",
                            "IIT Varanasi(BHU)"};
                    ArrayAdapter<String> spinnerArrayAdapter = new ArrayAdapter<String>(stud_profile_info_2.this, android.R.layout.simple_spinner_item, array);
                    spinnerArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item); // The drop down view
                    college.setAdapter(spinnerArrayAdapter);
                } else if (text.equals("National Institute Of Technology")) {
                    String[] array = {"Select College", "NIT Agartala",
                            "NIT Allahabad ",
                            "NIT Arunachal Pradesh ",
                            "NIT Bhopal ",
                            "NIT Calicut ",
                            "NIT Delhi ",
                            "NIT Durgapur ",
                            "NIT Goa ",
                            "NIT Hamirpur ",
                            "NIT Jaipur ",
                            "NIT Jalandhar ",
                            "NIT Jamshedpur ",
                            "NIT Kurukshetra ",
                            "NIT Manipur ",
                            "NIT Meghalaya ",
                            "NIT Mizoram ",
                            "NIT Nagaland ",
                            "NIT Nagpur ",
                            "NIT Patna ",
                            "NIT Puducherry ",
                            "NIT Raipur ",
                            "NIT Rourkela ",
                            "NIT Silchar ",
                            "NIT Sikkim ",
                            "NIT Srinagar ",
                            "NIT Surat ",
                            "NIT Karnataka ",
                            "NIT Tadepalligudem ",
                            "NIT Trichy ",
                            "NIT Uttarakhand ",
                            "NIT Warangal"};
                    ArrayAdapter<String> spinnerArrayAdapter = new ArrayAdapter<String>(stud_profile_info_2.this, android.R.layout.simple_spinner_item, array);
                    spinnerArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item); // The drop down view
                    college.setAdapter(spinnerArrayAdapter);
                }else if (text.equals("VIT University")) {
                    String[] array = {"Select College", "Amaravati Campus", "Bhopal Campus","Vellore Campus"};
                    ArrayAdapter<String> spinnerArrayAdapter = new ArrayAdapter<String>(stud_profile_info_2.this, android.R.layout.simple_spinner_item, array);
                    spinnerArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item); // The drop down view
                    college.setAdapter(spinnerArrayAdapter);
                }else if (text.equals("SRM University")) {
                    String[] array = {"Select College", "Amaravati Campus", "Chennai Campus","Haryana Campus","Sikkim Campus"};
                    ArrayAdapter<String> spinnerArrayAdapter = new ArrayAdapter<String>(stud_profile_info_2.this, android.R.layout.simple_spinner_item, array);
                    spinnerArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item); // The drop down view
                    college.setAdapter(spinnerArrayAdapter);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {


            }
        });

    }
}
