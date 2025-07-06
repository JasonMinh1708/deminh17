import boto3

# Khởi tạo client EC2
ec2_client = boto3.client('ec2', region_name='ap-southeast-2')  # ví dụ Sydney

# ID của EC2 cần kiểm tra
instance_id = 'i-00eeb5e58baaeab1e'  # thay ID thật của bạn vào đây

def check_instance_status(instance_id):
    try:
        response = ec2_client.describe_instance_status(InstanceIds=[instance_id], IncludeAllInstances=True)
        
        if not response['InstanceStatuses']:
            print(f"Instance {instance_id} chưa có trạng thái (có thể đã bị terminate hoặc chưa chạy).")
            return
        
        for status in response['InstanceStatuses']:
            state = status['InstanceState']['Name']
            system_status = status['SystemStatus']['Status']
            instance_status = status['InstanceStatus']['Status']
            print(f"Instance {instance_id} đang ở trạng thái: {state}")
            print(f"System Status: {system_status}")
            print(f"Instance Status: {instance_status}")
    
    except Exception as e:
        print(f"Đã xảy ra lỗi: {e}")

if __name__ == "__main__":
    check_instance_status(instance_id)
