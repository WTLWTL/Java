	import javax. swing. JOptionPane;
	public class BloodPressure{
			public static void main(String args[])
			{
				double systolicPressure,diastolicPressure,pp;
				String str;
				str = JOptionPane. showInputDialog("����������ѹ��");
				systolicPressure = Double. parseDouble(str);   //stringת��Ϊdouble
				str = JOptionPane. showInputDialog("����������ѹ��");
				diastolicPressure = Double. parseDouble(str);
				pp=systolicPressure-diastolicPressure;
				if (Integer. parseInt(str)==2){
						systolicPressure=30*systolicPressure/4;
						diastolicPressure=30*diastolicPressure/4;
				}
				JOptionPane. showMessageDialog(null,"��������ѹ��"+systolicPressure+"mmHg");
				JOptionPane. showMessageDialog(null,"�������ѹ��"+diastolicPressure+"mmHg");
				System. out. println("�����System. out. println�������ʾ������ط�.");
				System. out. println("��������ѹ��"+systolicPressure+"��������ѹ��"+diastolicPressure);
				if(pp<20||pp>60){
						System. out. println("��ѹ�������߹�С�����������������뼰ʱ��ҽԺ����");
				}
				else{
						System. out. println("��ѹ��������"+"�ɼ����ж�Ѫѹ���Ƿ�����");
				}
				if((systolicPressure>=160)&&(diastolicPressure>=115))
							System. out. println("�����ضȸ�Ѫѹ����Ҫ������ҽ");
				else
							if((systolicPressure>=160)&&(diastolicPressure>=105))
										System. out. println("�����жȸ�Ѫѹ���뼰ʱ��ҽ����ϵ");
							else
									if((systolicPressure>=141)&&(diastolicPressure>=91))
											System. out. println("������ȸ�Ѫѹ��Ҫ�������飬ע���ճ���ʳ����Ϣ");
									else
										if((systolicPressure>=90)&&(diastolicPressure>=61))
										System. out. println("����Ѫѹ�����������������õ�����ϰ��");
										else
										System. out. println("���ǵ�Ѫѹ���뼰ʱ��ҽ����ϵ");
				
			}
	}